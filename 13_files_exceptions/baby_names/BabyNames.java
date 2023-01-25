import java.io.*;
import java.util.LinkedList;
import java.util.Random;
// data from https://www.ssa.gov/oact/babynames/limits.html
public class BabyNames {
    public static void main(String[] args) {
        // initialize the variables for cli arguments
        String fileName = "";
        String gender = "";
        if (args.length >= 2) {
            // if the arguments were provided, save their values
            fileName = args[0];
            gender = args[1];
        } else {
            System.out.println("You must provide two arguments: one for the filename, one for the gender (F/M)");
            System.exit(0);
        }   

        // create temporary holder of the names from the data file
        // for the specified gender
        LinkedList<String> genderedNames = new LinkedList<String>();

        // initialize our reader to null, so we can close later
        BufferedReader reader = null;
        try {
            // get last 4 chars in String (the file extension)
            String extension = fileName.substring(fileName.length() - 4); 
            if (!extension.equals(".csv")) {
                // throw our custom exception if it's not a CSV
                throw new IncompatibleExtensionException("Data Files must be in .csv format.");
            }
            reader = new BufferedReader(new FileReader(fileName));
            String currentLine;
            while((currentLine = reader.readLine()) != null) {
                // get the data from the line as an array of strings
                String[] row = currentLine.split(","); 
                if (row[1].equals(gender)) {
                    // only add names to our LinkedList if they match the requested gender
                    genderedNames.add(row[0]);
                }
            }
        } catch (IncompatibleExtensionException e) {
            // runs if we throw our custom exception in the code above
            System.out.println(e.getMessage());
            System.exit(-1); // terminate program
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
            // potential IOException that we need to handle
            try {
                if (reader != null) {
                  // you must close all file connections when you're done
                  reader.close();
                }
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }

        Random r = new Random();
        LinkedList<String> randomlyChosenNames = new LinkedList<String>();
        for (int i = 0; i < 3; ++i) {
            // get a random index
            int randomIndex = r.nextInt(genderedNames.size());
            // add that item from our potential names to our generated names
            randomlyChosenNames.add(genderedNames.get(randomIndex));
        }
        
        // write our names out to the new file
        PrintWriter writer = null;
        try {
            writer = new PrintWriter(new FileWriter("potential_names.txt"));
            writer.println(randomlyChosenNames);
        } catch (IOException e) {
            System.out.println("We could not write these names out to the file:");
            System.out.println(randomlyChosenNames);
        }
        if (writer != null) {
            writer.close();
        }
    }
}