import java.lang.ArithmeticException;

public class ExceptionsLecture {
    // let everyone using this method know that an ArithmeticException could occur
    // force the Exception to occur when attempting to divide by zero
    public static double divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            // force an exception and give it a message
            throw new ArithmeticException("You cannot divide by zero.");
        }
        return (double) a / b; // type-cast to a double
    }


    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        try {
            // add any code that could potentially cause an exception
            // don't want our whole program in here 
            // because it makes it hard to debug
            System.out.println(divide(a, b));
        } catch (ArithmeticException e) {
            // e variable of type ArithmeticException (named e by convention)
            System.out.println(e.getMessage());
        }

        String[] games = {"Scarlet", "Violet"};
        // get a number from the user as a CLI argument
        // print out which version of the game is playing based on that number
        try {
            if (args.length < 1) {
                throw new InvalidArgumentsException("You did not provide any args.");
            }
            int position = Integer.parseInt(args[0]); // parse the first CLI argument from String -> int
            String version = games[position]; // use the arg to get the selected game version
            System.out.println("You are playing the " + version + " pokemon game.");
        } catch (InvalidArgumentsException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("You provided an arg that was too big.");
        } catch (NumberFormatException e) {
            System.out.println("Please enter a numeric value corresponding to the game version.");
        }
        // POTENTIAL ISSUE - user puts a number that is bigger than the size of the version array
        // (java.lang.ArrayIndexOutOfBoundsException)
        // POTENTIAL ISSUE - user doesn't put any argument
        // (java.lang.ArrayIndexOutOfBoundsException)
        // POTENTIAL ISSUE - user could type out a string non-numeric arg
        // (java.lang.NumberFormatException)
    }
}