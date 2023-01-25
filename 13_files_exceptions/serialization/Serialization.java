/* 
  SERIALIZATION
  is the process of saving Objects in byte form to files, which allows
  for efficient saving/loading of entire Objects instead of data processing
  between a text file / structured data format. The byte stream is platform independent, so it allows objects to be saved in one place, transferred to another place, and loaded in like normal (good for communicating between web servers/databases, etc)

  All Objects that you write out through serialization must implement the Serializable class.
*/
import java.io.*;
public class Serialization {
  public static void main(String[] args) {
    // we can Serialize any object that implements Serializable
    Student me = new Student("Me",4);
    System.out.println(me);

    try {
      // we use the ObjectOutputStream class for this
      ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("./student.ser")); // .ser is a file extension convention
      out.writeObject(me); 
      out.close();
      System.out.println("Student was successfully serialized.");
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }

    // create a temporary variable to try to load in
    Student test = null;
    try {
      // create an ObjectInputStream connected to the file 
      // where we serialized our object to
      ObjectInputStream in = new ObjectInputStream(new FileInputStream("./student.ser"));
      // readObject will load in the byte data and re-recreate the object
      // throws ClassNotFoundException when it does not know
      // where the Student.class file is to create the object
      test = (Student) in.readObject();

      in.close();
      
      System.out.println("Student has been deserialized...");
      System.out.println(test);
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } catch (ClassNotFoundException e) {
      System.out.println(e.getMessage());
    }
  }
}