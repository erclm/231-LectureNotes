/* 
    You will need to have our Book.java class 
    in this directory for this code to run as is.
*/
import java.io.*;

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
        Book book = new Book("ISBN","The Color Purple","Alive Walker",276);

        // we must wrap opening files for input or output
        // in a try/catch block, since their methods throw several Exceptions
        try {
            // param to FileReader constructor is the local path to the file
            reader = new BufferedReader(new FileReader("./book.txt"));
            String currentLine;
            // set currentLine to the next line in file
            // make sure that line is not null 
            // when it's null, there is nothing in the file
            while((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine.toUpperCase());
            }
            
            // first param to our FileWriter constructor is the local path to the file
            // second param is a boolean flag for whether or not to append to the file
            writer = new PrintWriter(new FileWriter("./bookOut.txt", true));
            // we can write out strings to files just like to console
            writer.println("Let's write out a simple string!");
            // we can also write out objects using their toString method
            writer.println(book);
        } catch (FileNotFoundException e) {
            // runs if the file does not exist
            // organize our catch statements my most specific -> lest specific
            System.err.println("We couldn't find that file.");
        }
        catch (IOException e) {
            // runs if something else breaks during file i/o
            System.out.println("Error reading or writing to a file.");
            System.err.println(e.getMessage());
        }
        finally {
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