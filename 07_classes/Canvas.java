/** 
 * The Canvas class represents a two dimensional canvas
 * used to display ASCII art.
 * @author Murphy Studebaker
 * @version 1.0
*/
public class Canvas {
    // define our member variables
    private char[][] canvas;

    // define our constructors that set values for
    // the member variables
    // default constructor runs when no parameters are given
    // use this to either set up an empty version of your object
    // or a version with default values (depending on use case)
    public Canvas() { // constructors always have to match class name
        // setting the private member variable "canvas"
        // to a 2D char array of size 10x10
        canvas = new char[10][10];
        createCanvas();
    }

    // overloaded constructor that allows us to pass in values
    // specifying the desired width and height
    public Canvas(int width, int height) {
        canvas = new char[height][width];
        createCanvas();
    }

    // any helpful methods that make the object easier to use
    public int height() {
        return canvas.length;
    }

    public int width() {
        return canvas[0].length;
    }

    // TODO: add your createCanvas method to the Canvas class
    // modify it so that it is manipulating the member variable "canvas"
    // instead of taking in height/width and returning 2d char array


    // TODO: also add your addCharacter method
    // (again modifying the member variable instead of returning
    // a reference to the modified canvas)

    // define a toString method
    // to determine how objects should be printed out
    public String toString() { // always the same signature
        String output = "";
        for (int outer=0; outer < canvas.length; ++outer) {
            for (int inner=0; inner < canvas[0].length; ++inner) {
                output += " " + canvas[outer][inner] + " ";
            }
            output += "\n";
        }
        return output;
    }
}