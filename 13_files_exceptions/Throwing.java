import java.io.*;

public class Throwing {
    // now we have abstracted away some of our file reading logic into a function
    // we use the keyword "throws" to indicate we are pushing responsibility 
    // to handle the IOException back to whoever called the method
    // (otherwise we would have to have a try/catch inside our method and handle it here)
    // we also throw our custom Exception that checks for explicit language
    public static void readFile(BufferedReader reader) throws IOException, ExplicitLanguageException {
        String currentLine;
        int nLines = 0;
        while((currentLine = reader.readLine()) != null){
            if (currentLine.contains("fuck") || currentLine.contains("shit")) {
                // we must create a new object of our custom exception with whatever error message we want
                // keyword "throw" says "hey, something is wrong! somebody else do something about it!" 
                throw new ExplicitLanguageException("This file contains bad words.");
            }
            nLines++;
        }
        System.out.println("There are " + nLines + " lines in your file.");
    }

    public static void main(String[] args) {
        // we still want to declare the Reader object here
        // so we can close it whether or not the readFile method succeeds
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("./book.txt"));
            Throwing.readFile(reader);
        } catch (ExplicitLanguageException e) {
            // if our custom error is thrown, we print the error message that was passed into the constructor
            System.out.println(e.getMessage());
        }
        catch (FileNotFoundException e) {
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