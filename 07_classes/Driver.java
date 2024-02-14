/**
 * Drivers
 * This class's only function is running our 
 * main method.
 */
public class Driver {
  public static void main(String[] args) {
    // creating an instance of our Canvas class
    // using the default constructor
    // we do not need to import this since we are in the same directory
    Canvas defaultCanvas = new Canvas(); 
    Canvas customCanvas = new Canvas(3, 3);

    System.out.println("Height: " + customCanvas.height());
    System.out.println("Width: " + customCanvas.width());

    System.out.println(customCanvas); // will call the toString on Canvas

    customCanvas.addCharacter('*',1,1); // add * to position (1,1) in the member variable
    System.out.pritnln(customCanvas); // see your character added
  }
}