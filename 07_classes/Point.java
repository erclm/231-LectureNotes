public class Point {
    private int x;
    private int y;
    private char contents;

    public Point(char contents) {
        x = 0;
        y = 0;
        this.contents = contents;
    }

    public Point(char contents, int x, int y) {
        this.x = x;
        this.y = y;
        this.contents = contents;
    }

    public int X() {
        return x;
    }

    public int Y() {
        return y;
    }

    public char getContent() {
        return contents;
    }

    public String toString() {
        return contents + "  (" + x + "," + y + ")";
    }
}