import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* Random Number Generation
           - similar to Scanner, we create a generator object of class Random
           - based off a seed, so considered "pseudo-random"
        */
        Random numberGenerator = new Random();
        // min number possible is always 0 (you can add to the number to offset this)
        // pass in max number (non-inclusive)
        // leave parentheses blank to include all possible ints
        int randomNumber = numberGenerator.nextInt(100) + 1; // original range is 0 -> 99, we offset by 1 to get range 1 -> 100
        System.out.println("Computer generated ~{ " + randomNumber + " }~");
        
        // set up our user input like we covered last class
        Scanner in = new Scanner(System.in);
        System.out.print("Guess a number: ");
        int guess = in.nextInt();
        System.out.println("You guessed |[ " + guess + " ]|");

        /* While Loops */
        // we can use != or == here because both are primitive types
        while (guess != randomNumber) {
            // runs as long as above is true
            System.out.println(":(  WRONG  ):");
            System.out.print("Guess a number: ");
            guess = in.nextInt(); // stopping condition
        } 
        // runs after loop completion
        System.out.println("!!!!! WINNER !!!!!");

        /* For Loops 
           - yes, they are wacky, but they give you more control
           - consist of three statements: 
                1) declaring & initializing your controlling variable
                2) setting your stopping condition
                3) writing your increment statement

        */
        int flirtLevel = 10;
        String message = "hey";
        for (int i = 0; i < flirtLevel; i++){
            message += "y";
        }
        System.out.println("New Message: " + message);

        /* More String Methods 
          - .contains()
          - .indexOf()
          - .replace()
          - toUpperCase() toLowerCase()
        */
        String data = "movies,movies,books,movies,books,books";
        // does "tv" exist in the data?
        String searchTerm = "tv";
        System.out.println(data.contains(searchTerm));

        // get position of first "books"
        System.out.println(data.indexOf("books"));

        // change whole string to capital letters
        System.out.println(data.toUpperCase());
        System.out.println(data); // not modified in place

        // change all instances of a substring to something else
        System.out.println(data.replace("movies", "poetry"));
        System.out.println(data); // again, not modified in place
    }
}
