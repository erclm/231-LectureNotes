import java.util.Random;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /* WHILE LOOPS 
           - similar to python syntax
           - run as long as a condition is true
           - can use break and continue keywords
           - (break stops the loop, continue skips to the next iteration)
           - potential for an infinite loop, so just make sure
           there is a stopping condition
        */
        // generates a random number between 1 and 10
        // allow the user to guess until they get it right
        // tell the user if they're right or wrong after each guess
        Scanner in = new Scanner(System.in);
        Random randy = new Random();
        // save the generated number to a variable
        // param is a non-inclusive max, shift up by 1
        int generated = randy.nextInt(10) + 1; 
        System.out.println("Randy Gave Us: " + generated);
        System.out.print("Guess a number between 1 and 10: ");
        int guess = in.nextInt();
        System.out.println("You guessed: " + guess);

        while (guess != generated) {
            // tell the user they're wrong
            System.out.println("WRONG! :(");
            // allow them to guess again
            System.out.print("Guess again: ");
            guess = in.nextInt();
        }
        System.out.println("WINNER!!!!!");

        /* 
            FOR LOOPS
            - consist of 3 statements
            1) declare and initialize your controlling variable (iterator)
            2) sets up the stopping condition
            3) your increment statement 
        */
        int flirtLevel = 10;
        String message = "hey";
        // build the message string 
        // by adding a y for each flirt level
        for (int i = 0; i < flirtLevel; i+=2) {
            message += "y";
        }
        System.out.println("New Message: " + message);

        /* Commonly Used String Methods */
        String data = "movies,movies,books,movies,books";
        // what is the first letter of the string?
        System.out.println(data.charAt(0));
        // does the substring "tv" exist in the string data?
        System.out.println(data.contains("tv"));
        // where is the first occurrence of "books" ?
        // return -1 if not in the string
        System.out.println(data.indexOf("books")); 
        // normalize the case of the string
        System.out.println(data.toUpperCase());
        System.out.println(data.toLowerCase());
        // change all occurrences of "movies" to "poetry"
        System.out.println(data.replace("movies","poetry"));
        // data = data.replace("movies","poetry"); // re-assign to permanently change
        System.out.println(data); // original value, not modifying it in place
    }
}
