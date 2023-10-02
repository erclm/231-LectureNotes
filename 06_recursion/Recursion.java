/**
 * RECURSION
 * Recursion is another approach to solving repetitive problems, in which
 * a method will call itself within the method body.
 * 
 * All problems that can be solved recursively can also be solved iteratively
 * (with loops), but sometimes recursion is more straightforward
 * 
 * Generally speaking there are no performance benefits to using recursion in
 * Java over an iterative solution
 */
public class Recursion {
  public static void main(String[] args) {
    // System.out.println(Recursion.addMeUp(3));
    // System.out.println(Recursion.isPalindrome("MOMMAM"));
    // Recursion.hooray(2);
    // Recursion.writeVertically(450);

    int[] numbers = {-10, -4, 0, 7, 32, 67, 100, 210, 405};
    System.out.println(Recursion.magicNumber(numbers));
    System.out.println(fib(4));
  }

  /*
   * RECURSIVE METHODS ALWAYS NEED
   * 1. A stopping case that will prevent inifinite recursion
   * 2. A recursive case that will call the method again with a smaller param as
   * input
   */
  private static int addMeUp(int n) {
    if (n == 1) {
      System.out.print(n + "=");
      // stopping case (also called base case)
      return n;
    } else {
      // recursive call
      // we pass in n - 1
      System.out.print(n + "+");
      return n + addMeUp(n - 1);
    }
  }

  private static int fib(int n) {
    System.out.println("Called with " + n);
    if (n <= 1) {
      return n;
    } else {
      return fib(n-1) + fib(n-2);
    }
  }

  private static void writeVertically(int n) {
    System.out.println("Input was: " + n);
    if (n < 10) {
      // only the last 10ths place integer, like 3 or 7
      System.out.println("Stopping case is true...");
      System.out.println(n);
    } else {
      // larger than the last 10ths place, like 12 or 46
      // make our recursive call
      System.out.println("Making the recursive call...");
      writeVertically(n / 10); // send the smaller tens place number
      System.out.println("Coming out of recursive call...");
      System.out.println(n % 10); // print the remainder
    }
  }

  private static boolean isPalindrome(String word) {
    System.out.println("Received " + word);
    if (word.length() < 2) {
      return true;
    }
    if (word.charAt(0) != word.charAt(word.length() - 1)) {
      return false;
    }
    return isPalindrome(word.substring(1, word.length() - 1));
  }

  private static void hooray(int nHips){
    if (nHips == 0) {
      System.out.println(" Hooray!");
    } else {
      System.out.print("Hip ");
      hooray(nHips - 1);
    }
  }



  /* 
    Given an int array, return a "magic number" 
    where the value matches the index (or -1 if none exist)
  */
  private static int magicNumber(int[] array) {
    return magicNumber(array, 0, array.length - 1);
  }

  private static int magicNumber(int[] array, int start, int end) {
    System.out.println("Looking at positions " + start + "-" + end);
    // start and end are integers
    // representing the indices we want to search between
    if (end < start) {
      return -1; // no magic number present, our search has overlapped
    }
    int middle = (start+end) / 2; // find index of middle value
    System.out.println("Middle is " + middle);
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
