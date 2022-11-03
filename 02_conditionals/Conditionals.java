import java.util.Random; // have to import Random class
import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        String FAVORITE_DOG = "Golden Retriever";
        String guess = "Australian Shepherd";

        /*
         * If / Else if / Else Statements
         * - similar to python if statements
         * - parentheses requried
         */
        if (guess.equals(FAVORITE_DOG)) {
            System.out.println("You guessed it!");
        } else if (guess.equals("Australian Shepherd")) {
            System.out.println("No, but close!");
        } else {
            System.out.println("No, you are wrong.");
        }

        /*
         * Switch Statements
         * - can only use bytes, chars, shorts, ints, or Strings
         * - use break to end the switch statement
        //  */
        switch (guess) {
            case "Golden Retriever":
                System.out.println("You guessed it!");
                break;
            case "Australian Shepherd":
                System.out.println("No, but close!");
                break;
            default: 
                System.out.println("No, you're wrong!");
        }

        /* Random Number Generation
         * - you have to import the Random class
         * - create a Random object
         */
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1;
        if (randomNumber <= 5) {
            System.out.println("Yes!");
        } else {
            System.out.println("No!");
        }
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int num1 = in.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = in.nextInt();
        in.nextLine();
        System.out.println("You have entered " + num1 + " and " + num2);

        System.out.println("What do you want to do with these numbers? (add/multiply)");
        String operation = in.next();
        
        switch (operation) {
            case "add":
                System.out.println(num1 + num2);
                break;
            case "multiply":
                System.out.println(num1 * num2);
                break;
            default:
                System.out.println("I don't know what that means.");
                break;
        }
    }
}