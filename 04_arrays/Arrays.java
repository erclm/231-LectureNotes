public class Arrays {
    public static void main(String[] args) {
        /* 
            ARRAYS
            - fixed in size (you cannot add or removie items after creating)
            - homogenous (every item must be the same type)
            - mutable (you can change the value at a position)
        */
        // create an empty array / array with default values
        // create a new String array of size 5
        String[] movies = new String[5];
        // modify the value at a particular position
        movies[0] = "Whiplash";
        movies[1] = "Titanic";
        movies[2] = "Fight Club";
        // printing out the array variable just prints out the reference
        // (memory address), not the array's contents
        System.out.println(movies); // [Ljava.lang.String;@1dbd16a6

        // if we want to see the values, we can loop through and print them out
        for (int i=0; i < movies.length; ++i) {
            if (movies[i] == null) {
                System.out.println("TO BE ANNOUNCED...");
                continue;
            }
            System.out.println(movies[i]);
        }

        // creating an array with initial values
        int[] votes = {10, 12, 8, 0, 0};
        // figure out how many people voted
        int totalVotes = 0;
        /* FOR EACH LOOP 
           essentially python's "for v in votes"
           declare a variable for each value : something to loop through
        */
        for (int v: votes) {
            totalVotes += v;
        }
        System.out.println("Total votes cast: " + totalVotes);

        // with Strings you need to use .toCharArray()
        String winner = "Titanic";
        // give the user a hangman-style hint 
        char hint = 'I';
        for (char letter : winner.toUpperCase().toCharArray()) {
            if (letter == hint) {
                System.out.print(letter + " ");
            } else {
                System.out.print("_ ");
            }
        }
        System.out.println();

        /* Command Line Arguments 
           - any space seperated words typed in after the class name
           when executing a program with "java ClassName"
           - typically used for things like file names or mode adjustments
        */
        // determine how many args were passed in
        System.out.println("Received " + args.length + " CLI arguments.");
        if (args.length > 0) {
            System.out.println("You are running this program on " + args[0] + " mode.");
        }

        /* 2D Arrays 
           - an array of arrays
        */
       // creating a 2D integer array
       int[][] matrix = new int[3][4];
       System.out.println("Number of Arrays: " + matrix.length);
       System.out.println("Length of each array: " + matrix[0].length);

      // modify a value at a position in a 2D array
       matrix[0][0] = 8;
       matrix[0][3] = 8;

        for (int outer=0; outer < matrix.length; ++outer) {
            for (int inner=0; inner < matrix[0].length; ++inner) {
                System.out.print(matrix[outer][inner] + " "); 
            }
            System.out.println();
        }

    }
}