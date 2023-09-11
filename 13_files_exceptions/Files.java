/* 
  Since we are using a lot of the classes inside the java io package, 
  we are going to impor them all
*/
import java.io.*;
import java.util.HashMap;

public class Files {
  public static void main(String[] args) {
    // we want to declare this in global scope
    // but wait to set up the connection inside a try/catch
    PrintWriter writer = null; 
    BufferedReader reader = null;
    HogwartsStudent student = new HogwartsStudent();
    HashMap<String, Integer> wordCounts = new HashMap<String, Integer>();

    try {
      // set up our connection, potential for an IOException
      // create a new PrintWriter object - that constructor is going to take a new FileWriter object
      // FileWriter takes two params - the first is the path to the file, the second is a boolean for appending or not
      // if the file does not exist, it will create a new one
      writer = new PrintWriter(new FileWriter("output.txt", true));

      writer.println("Let's write out a simple string!");
      writer.println(student); // uses the toString method on our object

      // BufferedReader connection can also throw IOExceptions
      // create a new BufferedReader, constructor accept a FileReader object - just needs a file name
      // if the file does not exist, throw a FileNotFoundException
      reader = new BufferedReader(new FileReader("poem.pdf"));
      String currentLine; // set up our variable so we can assign it the value of each line in the file
      // while there is still info in the file to read in, 
      // assign the next line in the file to currentLine variable
      // once nothing is left in the file, reader.readLine() will return null
      while ((currentLine = reader.readLine()) != null) {
        String[] words = currentLine.split(" ");
        // TODO: create a HashMap that maps each word in the file
        // to the count of the number of times that word is in the file
        for (String word : words) {
          // see if our hashmap already has this word
          // if it does, increase the current count by 1
          // if it doesn't, add the word to the hashmap with a count of 1
          if (wordCounts.containsKey(word)) {
            int currentCount = wordCounts.get(word);
            wordCounts.put(word, ++currentCount);
          } else {
            wordCounts.put(word, 1);
          }
        }

      }



    } catch (FileNotFoundException e) {
      // FileNotFoundException is a chile of IOException, so it is more specific of an exception
      // we want to list it first so we can catch it 
      System.out.println("Could not find that file.");
    } catch (IOException e) {
      System.out.println("There was an error writing out to that file.");
    } finally {
      // close our connections after we open them
      // because eventually you could hit a limit for number of connections open
      if (writer != null) {
        writer.close(); 
      }

      // the BufferedReader has to be closed in a try/catch
      try {
        if (reader != null) {
          reader.close();
        } 
      } catch (IOException e) {
        System.out.println("Error when closing the reader.");
      }

    }
    System.out.println(wordCounts);
  }
}