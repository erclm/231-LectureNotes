// every java file will have a class
// the class name MUST match the file name

// import the Scanner class whenever we are going
// to get user input from terminal
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        // create an object of our Scanner
        Scanner userInput = new Scanner(System.in);

        // prompt the user seperately
        System.out.print("Enter your name: ");

        // create a variable to store the input
        // and use the Scanner's method to read the input in
        String name = userInput.nextLine();

        // concatenate the value of name to the output string
        System.out.println("Hello, " + name + "!");
    }
}