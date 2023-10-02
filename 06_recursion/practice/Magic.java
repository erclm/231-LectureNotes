/**
 * Write a method that returns the first occurrence of a "magic number" 
 * in a sorted (ascending) integer array. 
 * A magic number occurs when the index matches 
 * the value at that index in an array. 
 * 
 * Your method should return -1 if no magic numbers are present in the array.
 */
public class Magic {
  public static void main(String[] args) {
    int[] numbers = {-10,1,2,7,32,67,100,210,405};
    int[] numbers = {-100,1,2,3,4,5,6,7,8}
    System.out.println(magicBruteForce(numbers));
    System.out.println(magicIterative(numbers));
    System.out.println(magicNumber(numbers));
  }

  /* 
    Iterative brute force
    This implementation is the slowest possible way 
    you could solve this problem, because it always
    looks at every item in the array until a magic number is found.
  */
  private static int magicBruteForce(int[] array) {
    for (int i=0; i < array.length; ++i) {
      if (array[i] == i) {
        return i; // magic number was found
      }
    }
    return -1; // nothing was found
  }

  /* 
    More efficient iterative
    We do not need to look at every item, 
    since the array is sorted we can throw out
    portions of the array that are guaranteed to not
    have a magic number.
  */
  private static int magicIterative(int[] array) {
    // set up initial values to look at whole array
    int start = 0;
    int end = array.length;
    while (start <= end) {
      int middle = (start + end) / 2;
      if (array[middle] == middle) {
        return middle;
      } 
      if (array[middle] > middle) {
        // update values to look at left side
        start = start;
        end = middle-1;
      }
      else {
        // update values to look at right side
        start = middle+1;
        end = end;
      }
    }
    return -1;
  }

  /* 
    Given an int array, return a "magic number" 
    where the value matches the index (or -1 if none exist)

    Recursive solution
    The methods below work together to provide the same
    approach as the optimized iterative solution up above.
    Instead of having a while loop, this method calls itself
    and passes in the sliced version of the array to look at next.
  */
  private static int magicNumber(int[] array) {
    return magicNumber(array, 0, array.length - 1);
  }

  private static int magicNumber(int[] array, int start, int end) {
    // start and end are integers
    // representing the indices we want to search between
    if (end < start) {
      return -1; // no magic number present, our search has overlapped
    }
    int middle = (start+end) / 2; // find index of middle value
    if (middle == array[middle]) {
      return middle; // checking if the middle value is magic
    }
    else if (array[middle] > middle) {
      // search left side, because right side will be too big
      return magicNumber(array, start, middle-1);
    } else {
      // search the right side, because left side will be too small
      return magicNumber(array, middle+1, end);
    }
  }

}
