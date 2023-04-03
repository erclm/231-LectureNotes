// need to import our collection classes before we can use them
import java.util.ArrayList;
import java.util.LinkedList;

public class Lists {
    public static void main(String[] args) {
        // create an ArrayList object that holds Integers
        ArrayList<Integer> nums = new ArrayList<Integer>();

        // adding items
        nums.add(4); // add to the end 
        nums.add(8);
        nums.add(16);
        nums.add(0, 100); // add 100 to the position 0, slide everything else over
        // instead of a reference, this is a nice pretty printed list of items
        System.out.println(nums); 

        // updating items
        nums.set(0, 2); // change the value at position 0 to 2
        System.out.println(nums);
        
        // removing items
        nums.remove(0); // removes the item at position 0
        nums.remove(Integer.valueOf(16)); // explicitly use the Wrapper class to remove by value 
        System.out.println(nums);

        System.out.println("Does 16 exist in the ArrayList? " + nums.contains(16));
        System.out.println("How many itmes are in the ArrayList? " + nums.size());
        // nums[0] does not work, you have to use get method
        System.out.println("What is the item at position 0? " + nums.get(0));

        // loop through ArrayLists using either a for each loop or standard for loop
        for (int n : nums) {
            System.out.println("ITEM: " + n);
        }

        for (int i=0; i < nums.size(); ++i) {
            System.out.println("ITEM: " + nums.get(i));
        }

        LinkedList<String> names = new LinkedList<String>();
        names.add("Prince Zuko");
        names.add("Azula");
        names.add("Uncle Iroh");
        names.add(0, "Toph");
        System.out.println(names);

        names.remove(0); // remove position 0
        names.remove("Prince Zuko"); // remove by value

        System.out.println(names);

    }
}