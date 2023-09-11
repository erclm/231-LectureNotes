/**
 * This is the starter code file for your assignment
 * MP1: Drawing with 2D Arrays
 * 
 * Download this file or copy and paste into your text editor,
 * then implement the methods to complete your solution.
 */
public class Drawing {
    public static char[][] createCanvas(int width, int height) {
        // TODO: Implement this method according to the brief
        return null;
    }

    public static void addCharacter(char[][] canvas, char emoji, int x, int y) {
        // TODO: Implement this method according to the brief
    }

    /* 
        This method prints out your Canvas by iterating through
        each outer array as a single line, and each position in the outer array
        as a cell on that line.

        It also adds axis labels for you to the output, so you can verify
        that your characters are being added appropriately.

        DO NOT MODIFY THIS METHOD
    */
    public static void printCanvas(char[][] canvas) {
        System.out.println();
        System.out.println();
        for (int i = 0; i < canvas.length; ++i) {
            System.out.print((canvas.length - i - 1) + " ");
            
            for (int col = 0; col < canvas[i].length; ++ col) {
                System.out.print(canvas[i][col]);
                System.out.print(' ');
            }
            System.out.println();
        }
        System.out.print(" ");
        for (int i = 0; i < canvas[0].length; ++i) {
            System.out.print(" " + i);
        }
        System.out.println();
        System.out.println();
        System.out.println();

    }

    public static void main(String[] args) {
        // TODO: Create a canvas of any size
        // TODO: Add whatever characters you want to the canvas
        // TODO: print out the canvas with the art added
    }
}