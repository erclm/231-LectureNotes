import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class Comparing {
    public static void main(String[] args) {
        // create an array, ArrayList, and LinkedList
        Random randy = new Random();
        Integer[] array = new Integer[100000];
        ArrayList<Integer> al = new ArrayList<Integer>();
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // add 100k random Integers to each one
        // time how long it takes for each
        long start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(101);
            // add it to the array at position i
            array[i] = r;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time for populating array " + (stop - start));

        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(101);
            // add it to the array at position i
            al.add(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for populating ArrayList " + (stop - start));

        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(101);
            // add it to the array at position i
            ll.add(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for populating LinkedList " + (stop - start));
        // select 20k random Integers from each and calculate the sum
        // time how long it takes for each
        start = System.currentTimeMillis();
        int sum = 0;
        for (int i=0; i < 20000; ++i) {
            // generate a random index
            int r = randy.nextInt(100000);
            // add the value at position r to the sum
            sum += array[r];
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for indexing array " + (stop - start));
    
        start = System.currentTimeMillis();
        sum = 0;
        for (int i=0; i < 20000; ++i) {
            // generate a random index
            int r = randy.nextInt(100000);
            // add the value at position r to the sum
            sum += al.get(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for indexing ArrayList " + (stop - start));
    
        start = System.currentTimeMillis();
        sum = 0;
        for (int i=0; i < 20000; ++i) {
            // generate a random index
            int r = randy.nextInt(100000);
            // add the value at position r to the sum
            sum += ll.get(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for indexing LinkedList " + (stop - start));
    }
}