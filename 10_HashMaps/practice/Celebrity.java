import java.util.HashMap;
import java.util.Scanner; 

public class Celebrity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> lookup = new HashMap<String, String>();
        lookup.put("Tom Felton", "tfelton@hogwarts.edu");
        lookup.put("Emma Watson", "emma@brown.edu");

        System.out.print("Enter a celebrity name: ");
        String name = in.nextLine();

        if (lookup.containsKey(name)) {
            System.out.println("The email address on record is " + lookup.get(name));
        } else {
            System.out.println("We do not have an email on record for that celebrity.");
            System.out.print("Please enter their email to save: ");
            String email = in.nextLine();
            lookup.put(name, email);
        }
        System.out.println(lookup);
    }
}