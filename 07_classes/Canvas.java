public class Canvas {
    private char[][] array;

    public Canvas(int width, int height) {
        array = new char[width][height];
        createCanvas();
    }

    private void createCanvas() {
        for (int row = 0; row < array.length; ++row) {
            for (int col = 0; col < array[row].length; ++col) {
                if (row == 0 || row == (array.length - 1)) {
                    array[row][col] = '-';
                } else if (col == 0 || col == (array[row].length - 1)) {
                    array[row][col] = '|';
                } else {
                    array[row][col] = ' ';
                }
            }
        }
    }

    public void addCharacter(Point p) {
        array[p.X()][p.Y()] = p.getContent();
    }

    public char[][] getCanvas() {
        return array;
    }

    public int width() {
        return array.length;
    }

    public int height() {
        return array[0].length;
    }

    public String toString() {
        String output = "";
        for (int i = 0; i < array.length; ++i) {
            for (int col = 0; col < array[i].length; ++ col) {
                output += " " + array[i][col] + " ";
            }
            output += "\n";
        }
        return output;
    }
}