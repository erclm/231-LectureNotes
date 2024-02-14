import java.util.Random;
import java.util.ArrayList;
import java.util.LinkedList;

public class Comparing {
    public static void main(String[] args) {
        // create an array, ArrayList, and LinkedList
        Random randy = new Random();
        Integer[] array = new Integer[100000];
        ArrayList<Integer> al = new ArrayList<Integer>();
        ArrayList<Integer> al_w_default = new ArrayList<Integer>(100000);
        LinkedList<Integer> ll = new LinkedList<Integer>();

        // add 100k random Integers to each one
        // time how long it takes for each
        System.out.println("------ ADDING ------");
        long start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(100) + 1;
            // add it to the array at position i
            array[i] = r;
        }
        long stop = System.currentTimeMillis();
        System.out.println("Time for populating array " + (stop - start));

        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(100) + 1;
            // add it to the array at position i
            al.add(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for populating ArrayList " + (stop - start));


        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(100) + 1;
            // add it to the array at position i
            al_w_default.add(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for populating ArrayList with default size " + (stop - start));

        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            // generate a random number
            int r = randy.nextInt(100) + 1;
            // add it to the array at position i
            ll.add(r);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for populating LinkedList " + (stop - start));
        
        // select 20k random Integers from each and calculate the sum
        // time how long it takes for each
        System.out.println("------ INDEXING ------");
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
            al_w_default.remove(0);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for removing ArrayList with default size " + (stop - start));



        start = System.currentTimeMillis();
        for (int i=0; i < 100000; ++i) {
            //remove last element
            ll.remove(0);
        }
        stop = System.currentTimeMillis();
        System.out.println("Time for removing LinkedList " + (stop - start));

    
    }
}