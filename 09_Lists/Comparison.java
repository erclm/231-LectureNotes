import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Random;

/*
    TASK
    Create a LinkedList and an ArrayList that both store
    Integer values, then populate both lists with 100,000 random integers.

    Loop through each list seperately and calculate the time it takes
    for both Lists to randomly select 20,000 numbers from the list
    and calculate its sum. 

    You can use the example code below for calculating the time
    of an operation. 

    Which Collection type performs better? Why do you think this is?
*/
public class Comparison {
  public static void main(String[] args) {
    // create the Integer LinkedLists and ArrayLists
    // as well as your Random object
    ArrayList<Integer> al = new ArrayList<Integer>();
    LinkedList<Integer> ll = new LinkedList<Integer>();
    Random rand = new Random();
    Integer[] normy = new Integer[100000];
    
    long start = System.currentTimeMillis();
    // populate each list with 100,000 random integers
    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      al.add(r);
    }
    long stop = System.currentTimeMillis();
    System.out.println("ArrayList time required for population: " + (stop - start));

    start = System.currentTimeMillis();

    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      ll.add(r);
    }
    stop = System.currentTimeMillis();
    System.out.println("LinkedList time required for population: " + (stop - start));

    
    start = System.currentTimeMillis();
    for (int i = 0; i < 100000; ++i) {
      int r = rand.nextInt(); // get random index
      normy[i] = r;
    }
    stop = System.currentTimeMillis();
    System.out.println("Simple array time required for population: " + (stop - start));


    // Calculate the sum of 20,000 random integers
    // in the ArrayList
    // Print out how many milliseconds it took to calc
    start = System.currentTimeMillis();
    int sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += al.get(index);
    }
    stop = System.currentTimeMillis();
    System.out.println("ArrayList time required for access: " + (stop - start));

    start = System.currentTimeMillis();
    sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += ll.get(index);
    }
    stop = System.currentTimeMillis();
    System.out.println("LinkedList time required for access: " + (stop - start));

    
    start = System.currentTimeMillis();
    sum = 0;
    for (int i = 0; i < 20000; ++i) {
      int index = rand.nextInt(100000); // get random index
      sum += normy[index];
    }
    stop = System.currentTimeMillis();
    System.out.println("Simple array time required for access: " + (stop - start));
  }
}