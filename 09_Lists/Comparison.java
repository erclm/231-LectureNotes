import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class Comparison {
    public static void main(String[] args) {
        // create an array, ArrayList, and LinkedList
        Random randy = new Random();
        ArrayList<Integer> al = new ArrayList<Integer>(100000);
        LinkedList<Integer> ll = new LinkedList<Integer>();

        System.out.println("------ ADDING ------");
        long start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(101);
            // add it to the array at position i
            al.add(r);
        }
        long stop = System.currentTimeMillis();
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
        
        System.out.println("------ INDEXING ------");
        start = System.currentTimeMillis();
        int sum = 0;
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
    
        System.out.println("------ REMOVING ------");
        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            //remove last element
            al.remove(0);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for removing ArrayList " + (stop - start));

        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            //remove last element
            ll.remove(0);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for removing LinkedList " + (stop - start));

    
    }
}