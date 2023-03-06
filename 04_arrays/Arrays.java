public class Arrays {
  public static void main(String[] args) {
    /* CLI Arguments */
    // get the size as a command line argument
    // create an array of that size
    // do nothing if there is no arg provided
    // if (args.length > 0) {
    //   // making sure they provided an arg
    //   System.out.println("Argument was " + args[0]);
    //   // turn the string into an integer
    //   int size = Integer.parseInt(args[0]);
    //   int[] numbers = new int[size];
    //   System.out.println("Length of array: " + numbers.length);
    // }

    /* 
      ARRAYS
      - fixed in size (cannot make them bigger or smaller)
      - homogenous (all items have to be of the same type)
      - mutable (change the value of an item at a specific position)
    */
    // String[] movies = new String[5];
    // movies[0] = "Whiplash"; // setting the value of the first element
    // movies[1] = "Birdman";
    // movies[2] = "I, Tonya";
    // // print out the reference for the array
    // System.out.println(movies);

    // // use a loop to print out the array's contents
    // for (int i=0; i<movies.length; ++i) {
    //   // if no String was set, change the value
    //   if (movies[i] == null) {
    //     movies[i] = "TO BE ANNOUNCED";
    //   }
    //   System.out.println(movies[i]);
    // }

    // int[] votes = {10,8,9,0,0};
    // int totalVotes = 0;
    // // loop through the array and calculate sum 
    // // of all elements
    // // for-each loop lets you automatically loop through
    // // each item in a collection
    // // for (declare variable : what you want to loop through)
    // for (int v: votes) {
    //   totalVotes += v;
    // }
    // System.out.println("There were "+totalVotes+" votes cast.");

    String winner = "Birdman";
    // loop through the string
    // print out only the consonants
    // Strings are not iterable on their own, turn into a char array
    for (char letter: winner.toUpperCase().toCharArray()) {
      String vowels = "AEIOU";
      // checking to see if the current letter is a vowel
      if (vowels.indexOf(letter) == -1) {
        // not a vowel, so print it out
        System.out.print(letter);
      }
    }
    System.out.println();
    // for (int i=0; i<winner.length(); ++i) {
    //   System.out.println(winner.charAt(i));
    // }

  }
}