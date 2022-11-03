import java.util.ArrayList;
import java.util.LinkedList;

public class Collections {
  public static void main(String[] args) {
    /*
     * Collection Objects + Primitive Wrapper Classes
     * All Objects are stored on the heap in Java,
     * while all primitive types are stored on the stack.
     * 
     * Collections in Java require that each member of the collection
     * be of an Object type, so **Generics and Wrapper Classes** were
     * introduced in Java 5. These allow us to "wrap" a primitive type
     * (for example an integer) in a corresponding Object class version
     * (Integer) so it can be stored in the collection.
     * 
     * Java handles the conversion between the primitive value and the Object
     * value automatically, which is called auto-boxing and auto-unboxing.
     * (putting the primitive value in the "box" of a wrapper class and then taking
     * it back out)
     * 
     * Without this feature, you had to typecast primitives to Objects
     * yourself, and your code would error if you assumed a type
     * incorrectly :(
     */

    // OLD WAY
    ArrayList listOfObjectsOnly = new ArrayList();
    for (int i = 0; i < 10; ++i) {
      // convert the i primitive type to an object using the appropriate
      // wrapper class
      listOfObjectsOnly.add(new Integer(i)); // this will show a deprecation warning
    }

    for (Object x : listOfObjectsOnly) {
      // when removing from the collection have to cast to the appropriate
      // class type to store
      Integer n = (Integer) x;
      // use method to convert to corresponding primitive
      System.out.println(n.intValue());
    }

    ArrayList<Integer> nums = new ArrayList<Integer>(); // create an empty Integer ArrayList []
    nums.add(8); // add the value 8 to the first available position [8]
    nums.add(16); // [8,16]
    nums.add(0, 4); // adds 4 to position 0, slides everything over [4,8,16]
    nums.remove(1); // removes item at position 1
    nums.remove(Integer.valueOf(4)); // removes first occurence of item with value of 4

    System.out.println(nums);
    System.out.println("Does 4 exist in the ArrayList? " + nums.contains(4));
    System.out.println("What is the length of the list? " + nums.size());
    System.out.println("ArrayList item at position 0: " + nums.get(0)); // use .get() instead of indexing
    for (int n : nums) {
      // typecasts to an integer primitive from Integer class automatically
      System.out.println(n);
    }

    ArrayList<Integer> al = new ArrayList<Integer>(10); // initial size 10
    System.out.println("Is the ArrayList empty?" + al.isEmpty());
    System.out.println(al.size());

    LinkedList<Integer> numsLL = new LinkedList<Integer>();
    numsLL = new LinkedList<Integer>();
    numsLL.add(8); // add the value 8 to the first available position [8]
    numsLL.add(16); // [8,16]
    numsLL.add(0, 4); // adds 4 to position 0, slides everything over [4,8,16]
    numsLL.set(0, 0); // sets position 0 to 0, does not slide over others

    for (int n : numsLL) {
      // typecasts to an integer primitive from Integer class automatically
      System.out.println(n);
    }

    System.out.println(numsLL);
    System.out.println("Does 4 exist in the LinkedList? " + numsLL.contains(4));
    System.out.println("What is the length of the list? " + numsLL.size());
  }
}