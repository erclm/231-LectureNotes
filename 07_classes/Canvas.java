/* 
    An example of using OOP instead of methods
    to accomplish the same task as MP1
*/
public class Canvas {
    /* 
        Define our member variables
        that describe any data associated with 
        our object
    */
    private char[][] canvas;

    /* Our constructors define how an object
    gets created */
    // Default: creates square 10x10 canvas
    public Canvas() {
        canvas = new char[10][10];
        createCanvas();
    }

    // overloaded constructor - allows developer to 
    // specify the desired width and height of the canvas
    public Canvas(int width, int height) {
        canvas = new char[height][width];
        createCanvas();
    }

    // private internal method
    private void createCanvas() {
        for (int row = 0; row < canvas.length; ++row) {
            for (int col = 0; col < canvas[row].length; ++col) {
                if ((row == 0 && col == 0) || (row==canvas.length-1 && col ==0) || (row == 0 && col == canvas[row].length - 1) || (row == canvas.length-1 && col == canvas[row].length - 1)) {
                    canvas[row][col] = '+';
                }
                else if (row == 0 || row == (canvas.length - 1)) {
                    canvas[row][col] = '=';
                } else if (col == 0 || col == (canvas[row].length - 1)) {
                    canvas[row][col] = '|';
                } else {
                    canvas[row][col] = ' ';
                }
            }
        }
    }

    public void addCharacter(char emoji, int x, int y) {
        // using (0,0) as the bottom left hand corner
        canvas[canvas.length - y - 1][x] = emoji;
    }

    /* Accessors and Mutators */
    // accessor for the canvas member variable
    public char[][] getCanvas() {
        return this.canvas;
    }
    // mutator for the canvas member variable
    public void setCanvas(char[][] newCanvas) {
        this.canvas = newCanvas;
    }

    /* TODO: create accessors for the width and height 
        - one method will return the height
        - one method will return the width
    */
    public int width() {
        return this.canvas[0].length;
    }

    public int height() {
        return this.canvas.length;
    }

    /* TODO: adapt your createCanvas method from homework 
        so that after each constructor runs, it sets up the borders
    */

    /* toString method allows us to override what gets printed
    to the terminal by System.out.print() */
    public String toString() {
        String output = "";
        for (int i = 0; i < canvas.length; ++i) {            
            for (int col = 0; col < canvas[i].length; ++ col) {
                output += " " + canvas[i][col] + " ";
            }
            output += "\n";
        }
        return output;
    }


}