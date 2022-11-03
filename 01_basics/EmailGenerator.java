import java.util.Scanner;

public class EmailGenerator {
  public static void main(String[] args) {
    // to get user import, we have to create a Scanner object
    // (make sure you have imported Scanner above)
    Scanner userInput = new Scanner(System.in);

    // now we prompt the user and save their response to a variable
    System.out.print("First name: ");
    // we use the nextLine method on the Scanner object we created
    // to get the input as a String
    String fName = userInput.nextLine();
    System.out.print("Last name: ");
    String lName = userInput.nextLine();

    // now we get the first letter of the first name
    // the full last name
    // and the email signature @chapman.edu
    // note that we cannot index strings with [0]
    String email = fName.charAt(0) + lName + "@chapman.edu";
    // then we make it lowercase (could do in one line)
    email = email.toLowerCase();

    // print out that bad boy
    System.out.println("Your email is " + email);
  }
}