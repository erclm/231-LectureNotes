public class Arrays {
  public static void main(String[] args) {
    /* Using CLI arguments */
    System.out.println("Config variable: " + args[0]);

    if (args[0].equals("special")) {
      System.out.println("Running special program...");
    } else {
      System.out.println("Running normal program...");
    }

    int size = Integer.parseInt(args[1]);
    System.out.println("Argument was " + args[1]);
    int[] numbers = new int[size];
    System.out.println("Created array of length " + numbers.length);
    for (int item : numbers) {
      System.out.println(item);
    }
    // /*
    // * Arrays
    // * - handled very differently in Java than in Python
    // * - contiguous block of memory (next to each other in a sequence)
    // * - arrays are FIXED IN SIZE (you cannot add or delete elements)
    // * - you can, however, change the value of an element at a specific position
    // * - arrays must contain values of only one type (you can't mix floats and
    // ints)
    // */
    // // declare an array of strings
    // // specify the initial fixed length
    // String[] movies = new String[5];

    // movies[0] = "Whiplash";
    // movies[1] = "Birdman";
    // movies[2] = "I, Tonya";

    // // prints the memory addess of the array
    // System.out.println(movies);

    // // note that we use .length (a property) instead of .length() (a method) for
    // // arrays
    // for (int i = 0; i < movies.length; i++) {
    // // you need to index the array to get the actual value
    // // note the presence of "null" values - this is like a placeholder none type
    // // value
    // // since we have not set a value at that position yet
    // // we can use == to check if a value is null
    // if (movies[i] == null) {
    // movies[i] = "TO BE ANNOUNCED";
    // }
    // System.out.println(i + ": " + movies[i]);
    // }

    // // you can set initial values with {} syntax (I know it's weird)
    // String[] awards = { "Best Picture", "Best Director" };
    // System.out.println("There are " + awards.length + " awards waiting to be
    // announced.");

    // int[] votes = { 10, 8, 9, 0, 0 };
    // int totalVotes = 0;
    // // this is a for each loop, similar to "for __ in ___"
    // // it only works with collection types in java
    // // declare temporary variable for each element : collection to loop through
    // for (int v : votes) {
    // totalVotes += v;
    // }
    // System.out.println("We've had " + totalVotes + " academy members weigh in.");

    // String winner = "Birdman";
    // /*
    // * THIS WILL GIVE YOU AN ERROR
    // * becaue Strings are not iterable types in Java
    // */
    // // for (char l: winner) {
    // // System.out.println(l);
    // // }
    // // instead, you can turn a String into an array of chars to loop through it
    // System.out.println("Here's a hint...");
    // for (char l : winner.toCharArray()) {
    // String VOWELS = "AEIOUaeiou";
    // // you can check if a char is present in a String with .indexOf()
    // if (VOWELS.indexOf(l) == -1) {
    // System.out.print(l);
    // }
    // }
    // System.out.print("\n");

    // /*
    // * 2D Arrays
    // * - 2D arrays are a common way to store data (rows and columns)
    // */
    // int boardSize = 5;
    // char[][] checkerboard = new char[boardSize][boardSize];

    // // for (int row = 0; row < checkerboard.length; row++) {
    // // for (int col = 0; col < checkerboard[row].length; col++) {
    // // checkerboard[row][col] = 'X';
    // // System.out.print(" " + checkerboard[row][col] + " ");
    // // }
    // // // go to next line
    // // System.out.println();
    // // }

    // /* Printing fun shapes into the checkerboard */
    // // for (int row = 0; row < checkerboard.length; row++) {
    // // for (int col = 0; col < checkerboard[row].length; col++) {
    // // if (col == 0) {
    // // checkerboard[row][col] = 'O';
    // // } else {
    // // checkerboard[row][col] = 'X';
    // // }
    // // System.out.print(" " + checkerboard[row][col] + " ");
    // // }
    // // // go to next line
    // // System.out.print("\n");
    // // }

    // for (int row = 0; row < checkerboard.length; row++) {
    // for (int col = 0; col < checkerboard[row].length; col++) {
    // if (col % 2 > 0) {
    // // odd columns should have odd X and even O
    // if (row % 2 > 0) {
    // checkerboard[row][col] = 'O';
    // } else {
    // checkerboard[row][col] = 'X';
    // }
    // } else {
    // // even columns should have even X and odd O
    // if (row % 2 > 0) {
    // checkerboard[row][col] = 'X';
    // } else {
    // checkerboard[row][col] = 'O';
    // }
    // }
    // System.out.print(" " + checkerboard[row][col] + " ");
    // }
    // // go to next line
    // System.out.print("\n");
    // }
    // }
  }
}