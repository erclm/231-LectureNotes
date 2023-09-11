/* 
 * Hash Maps
 * - have to import the class before using
 * - associative data structures (instead of sequential like a list)
 * - organized by key/value pairs
 * - designed for one way lookup (key to value)
 * - no duplicate keys (duplicate values are ok)
 */
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        // HashMap<TYPE_OF_KEY, TYPE_OF_VALUE>
        HashMap<String, String> capitals = new HashMap<String, String>();

        // add to a HashMap
        // add TX as a key and Austin as a value
        capitals.put("TX", "Austin");
        capitals.put("NY", "Albany");
        System.out.println(capitals);

        // updating values
        // if you use put with a new key, it adds a key/val pair
        // if you use put with an existing key, it overrides the value
        capitals.put("NY", "Manhattan");
        System.out.println(capitals);

        // retrieve a value by key
        String capitalOfTX = capitals.get("TX");
        System.out.println(capitalOfTX);

        // check if keys or values are present in HashMap
        System.out.println(capitals.containsKey("MI"));
        System.out.println(capitals.containsValue("Manhattan"));

        // loop through all keys or values in a HashMap
        // use .values() for values
        // use .keySet() for keys
        for (String state : capitals.keySet()) {
            System.out.println("Key: " + state);
            System.out.println("The capital of " + state + " is " + capitals.get(state));
        }

    }
}