import java.lang.ArithmeticException;

public class Exception {

  public static double divide(int a, int b) throws ArithmeticException {
    if (b == 0) {
      throw new ArithmeticException("You cannot divide by zero.");
    } else {
      return (double) a / b;
    }

  }

  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
      System.out.println(divide(a, b));
    } catch (ArithmeticException e) {
      System.out.println(e.getMessage());
    }

    String[] games = { "Scarlet", "Violet" };
    try {
      if (args.length < 1) {
        throw new InvalidArgumentsException("No arguments were provided");
      }
      int gamePosition = Integer.parseInt(args[0]);
      String gameVersion = games[gamePosition];
      System.out.println("You are playing the " + gameVersion + " pokemon game.");
    } catch (InvalidArgumentsException e) {
      System.out.println("You didn't provide enough arguments.");
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("The argument you provided does not correspond to a pokemon game.");
    } catch (NumberFormatException e) {
      System.out.println("Please enter a number (0/1) as an argument");
    }
  }
}