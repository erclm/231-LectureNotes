public class Arrays {
  public static void main(String[] args) {
    /* CLI arguments */
    if (args.length > 0) { 
      // checking to see if an arg was given
      // when user ran the program
      System.out.println("Argument was: " + args[0]);
      int size = Integer.parseInt(args[0]);
      // use the arg to create an array of that size
      int[] numbers = new int[size]; 
      System.out.println("Length of array: " + numbers.length);
    }

    /* ARRAYS 
       - reference types
       - mutable (you can change the value of an item)
       - fixed in size (cannot make larger or smaller)
       - homogenous (every item has the same type)
    */
    String[] movies = new String[5];
    movies[0] = "Whiplash";
    movies[1] = "Birdman";
    movies[2] = "I, Tonya";

    // if you print out the variable, you will get a reference
    System.out.println(movies);

    // loop through each item to print it out
    for (int i=0; i < movies.length; ++i) {
      // checking if there is a value at that position
      if (movies[i] == null) {
        // if not, set the value to this string
        movies[i] = "TO BE ANNOUNCED";
      }
      System.out.println(movies[i]);
    }

    int[] votes = {10,8,9,0,0};
    int totalVotes = 0;
    // for each loop
    // similar to a for ____ in ___ loop like python
    for (int v : votes) {
      // add each item in the array to our aggregator variable
      totalVotes+=v;
    }
    System.out.println("We've had " + totalVotes + " total votes.");

    String winner = "Birdman";
    System.out.println("Here's a hint...");

    // loop through a string and print out 
    // only the consonants
    for (char l : winner.toUpperCase().toCharArray()) {
      String VOWELS = "AEIOU";
      // check if char is present in the string
      if (VOWELS.indexOf(l) == -1) {
        System.out.print(l);
      }
    }
    System.out.println();
  }
}