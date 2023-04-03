/* 
 * Hash Maps
 * - have to import java.util.HashMap before using
 * - associative data structure (as opposed to a sequential structure like a list)
 * - organized by key/value pairs
 * - designed for one way lookup (take the key to lookup the value)
 * - no duplicate keys (but duplicate values is ok)
 */
import java.util.HashMap;
public class Maps {
    public static void main(String[] args) {
        // to create a HashMap, we list HashMap<TypeOfKey, TypeOfValue> 
        HashMap<String, String> capitals = new HashMap<String, String>();
        System.out.println(capitals);

        // add to a HashMap
        // put TX as a key and Austin as a value
        capitals.put("TX", "Austin");
        capitals.put("NY","Albany");

        // HashMaps has a toString method, so we can see the key value pairs
        // {TX=Austin, NY=Albany}
        System.out.println(capitals);

        // override a value
        // if you use put with an existing key, it will update the value
        // if you use with a new key, it will add to the HashMap
        capitals.put("NY", "Manhattan");
        System.out.println(capitals);

        // retrieve a value by key
        String capitalOfTX = capitals.get("TX"); 
        System.out.println(capitalOfTX);

        // check if keys or values are present in a HashMap
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