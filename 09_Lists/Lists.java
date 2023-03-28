// need to import our collection classes before we can use them
import java.util.ArrayList;
import java.util.LinkedList;
public class Lists {
    public static void main(String[] args) {
        // create an ArrayList that holds Integer items
        // using the default constructor
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // adding items to the ArrayList
        nums.add(4); // adds to the end
        nums.add(8);
        nums.add(16);
        nums.add(0, 10);

        System.out.println(nums); // nice print out instead of reference

        // update a value
        nums.set(0, 1000); // change the value at position 0 to 1000
        System.out.println(nums);

        // remove items from the ArrayList
        nums.remove(1); // removes the item at position 1
        nums.remove(Integer.valueOf(8)); // remove the item with value 8
        System.out.println(nums);

        // answer some basic questions about the ArrayList
        System.out.println("Does 16 exist in the ArrayList? " + nums.contains(16));
        System.out.println("How many items are in the ArrayList? " + nums.size());
        // nums[0] would give you an error, instead use .get()
        System.out.println("What is the item at position 0? " + nums.get(0)); 

        // looping through a collection
        // can use either a for-each loop or a standard for loop
        for (int n : nums) { 
            System.out.println("ITEM: " + n);
        }

        for (int i=0; i < nums.size(); ++i) {
            System.out.println("ITEM: " + nums.get(i));
        }

        // LinkedLists have the same interface, just a different underlying implementation
        LinkedList<String> names = new LinkedList<String>();
        names.add("Prince Zuko");
        names.add("Azula");
        names.add("Uncle Iroh");
        names.add(0, "Lee");
        System.out.println(names);

        names.remove(0); // reemove by position
        names.remove("Prince Zuko"); // remove by value
        System.out.println(names);
    }
}