/* 
    Create an Object reporesentation
    of our Canvas from MP1
*/
public class Canvas {
    /* 
        Define member variables
        (all of the data related to our object)
    */
    private char[][] canvas; 

    /* 
        Define our constructors
        (the code that runs when an object gets created)
    */
    //  Default: creates a square 10x10 canvas
    public Canvas() {
        canvas = new char[10][10];
        createCanvas();
    }

    // Overloaded: creates a canvas with specified width and height
    public Canvas(int width, int height) {
        canvas = new char[height][width];
        createCanvas();
    }

    public int height() {
        return canvas.length;
    }

    public int width() {
        return canvas[0].length;
    }

    // accessors
    public char[][] getCanvas() {
        return this.canvas;
    }
    // mutators
    public void setCanvas(char[][] newCanvas) {
        this.canvas = newCanvas;
    }

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



    /* 
        TODO: make a void method createCanvas
        that runs at the end of each constructor
        and adds all of the border decorations
        to the canvas member variable

        TODO: modify the toString method to 
        print out the whole canvas similar to your
        printCanvas method
    
        TODO: add your addCharacter method and modify it
        to add a character to the canvas member variable
    */


    // toString will ALWAYS have the same signature
    // Java calls it automatically
    // when you pass an object into println
    public String toString() {
        // a canvas of width: 10 and height: 10
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