/**
 * RECURSION
 * Recursion is another approach to solving repetitive problems, in which
 * a method will call itself within the method body.
 * 
 * All problems that can be solved recursively can also be solved iteratively
 * (with loops), but sometimes recursion is more straightforward
 * 
 * Generally speaking there are no performance benefits to using recursion in
 * Java over an iterative solution
 */
public class Recursion {
  public static void main(String[] args) {
    System.out.println(Recursion.addMeUp(3));
    System.out.println(Recursion.isPalindrome("MOMMAM"));
    Recursion.hooray(2);
    Recursion.writeVertically(450);
  }

  /*
   * RECURSIVE METHODS ALWAYS NEED
   * 1. A stopping case that will prevent inifinite recursion
   * 2. A recursive case that will call the method again with a smaller param as
   * input
   */
  private static int addMeUp(int n) {
    if (n == 1) {
      System.out.print(n + "=");
      // stopping case (also called base case)
      return n;
    } else {
      // recursive call
      // we pass in n - 1
      System.out.print(n + "+");
      return n + addMeUp(n - 1);
    }
  }

  private static void writeVertically(int n) {
    System.out.println("Input was: " + n);
    if (n < 10) {
      // only the last 10ths place integer, like 3 or 7
      System.out.println("Stopping case is true...");
      System.out.println(n);
    } else {
      // larger than the last 10ths place, like 12 or 46
      // make our recursive call
      System.out.println("Making the recursive call...");
      writeVertically(n / 10); // send the smaller tens place number
      System.out.println("Coming out of recursive call...");
      System.out.println(n % 10); // print the remainder
    }
  }

  private static boolean isPalindrome(String word) {
    System.out.println("Received " + word);
    if (word.length() < 2) {
      return true;
    }
    if (word.charAt(0) != word.charAt(word.length() - 1)) {
      return false;
    }
    return isPalindrome(word.substring(1, word.length() - 1));
  }

  private static void hooray(int nHips){
    if (nHips == 0) {
      System.out.println(" Hooray!");
    } else {
      System.out.print("Hip ");
      hooray(nHips - 1);
    }
  }

}
