public class Drums extends Instrument implements Comparable<Drums> {
    private int n_pieces;

    public Drums() {
        super("percussion");
        this.n_pieces = 5;
    }

    public Drums(int n_pieces) {
        super("percussion");
        this.n_pieces = n_pieces;
    }

    public void play() {
        System.out.println("badum pschhh!");
    }

    /* 
        - we provide the compareTo method since we are implementing Comparable
        - defines how to rank objects of our class
        - return 0 if the two objects are equivalent
        - negatvie number if this object is less than the other
        - positive number if this object is greater than the other
    */
    public int compareTo(Drums other) {
        return this.n_pieces - other.n_pieces;
    }

    public String toString() {
        return "This is a " + n_pieces + " piece drum kit.";
    }
}