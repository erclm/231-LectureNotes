import java.util.ArrayList;
import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        //PART 1 - WRAPPERS
        // Write 4 primitive types and create a corresponding wrapper class.
        // Use the wrapper object's methods to compare those objects and print
        int a = 5;
        Integer a_Wrapped = a;
        char b = 'b';
        Character b_Wrapper = b;
        boolean c = true;
        Boolean c_Wrapped = c;
        double d = 1.2324141234234;
        Double d_Wrapped = d;
        Double anotherWrappedDouble = 2.3;
        System.out.print(d_Wrapped);
        int comparedresult = Double.compare(anotherWrappedDouble, d_Wrapped);
        System.out.println(comparedresult);



        //PART 2 - LinkedLists & ArrayLists
        // Using a Char generic types, create one of each Lists
        // add, remove elements using the List Methods
        // print

        LinkedList<Character> linkedlista = new LinkedList<Character>();
        ArrayList<Character> arraylistb = new ArrayList<Character>();

        System.out.println(linkedlista);
        linkedlista.add(b_Wrapper);
        System.out.println(linkedlista);

        System.out.println(arraylistb);
        arraylistb.add(b_Wrapper);
        arraylistb.add('A');
        arraylistb.add('C');
        System.out.println(arraylistb);
        System.out.println(arraylistb.contains('b'));
        arraylistb.remove(new Character('A'));
        System.out.println(arraylistb);
        System.out.println(arraylistb.contains('b'));
       

        /*
         * OUTPUT
         * 1.23241412342341
         * []
         * [b]
         * []
         * [b]
         */

    }
}






        
