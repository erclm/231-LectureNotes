
/* 
    You will need to have our Book.java class 
    in this directory for this code to run as is.
*/
import java.io.*;
import java.util.HashMap;

public class Files {
  public static void main(String[] args) {
    // declare our reader and writer
    // while you can use Scanner for file IO as well,
    // we are using some alternative classes that provide more optimizations
    // behind the scenes
    BufferedReader reader = null;
    PrintWriter writer = null;
    // creating a book object to demonstrate how toString
    // works with files as well
    HogwartsStudent cedric = new HogwartsStudent("Cedric", 12);
    HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

    // we must wrap opening files for input or output
    // in a try/catch block, since their methods throw several Exceptions
    try {
      // param to FileReader constructor is the local path to the file
      reader = new BufferedReader(new FileReader("./poem.txt"));
      String currentLine;
      // set currentLine to the next line in file
      // make sure that line is not null
      // when it's null, there is nothing in the file
      while ((currentLine = reader.readLine()) != null) {
        String[] words = currentLine.replace(".", "").split("\\s+");
        for (String word : words) {
          word = word.replace(",", "").toLowerCase();
          if (wordCounts.containsKey(word)) {
            wordCounts.put(word, wordCounts.get(word) + 1);
          } else {
            wordCounts.put(word, 1);
          }

        }
        System.out.println(word Counts);
      }

     // first param to our FileWriter constructor is the local path to the file
      // second param is a boolean flag for whether or not to append to the file
      writer = new PrintWriter(new FileWriter("./output.txt", true));
      // we can write out strings to files just like to console
      writer.println("Let's write out a simple string!");
      // we can also write out objects using their toString method
      writer.println(friend);
    } catch (FileNotFoundException e) {
      // runs if the file does not exist
      // organize our catch statements my most specific -> lest specific
      System.err.println("We couldn't find that file.");
    } catch (IOException e) {
      // runs if something else breaks during file i/o
      System.out.println("Error reading or writing to a file.");
      System.err.println(e.getMessage());
    } finally {
      // close our open file connections
      if (writer != null) {
        // PrintWriter close() does not throw any exceptions
        writer.close();
      }
      // potential IOException that we need to handle
      try {
        if (reader != null) {
          reader.close();
        }
      } catch (IOException e) {
        System.err.println(e.getMessage());
      }
    }
  }
}