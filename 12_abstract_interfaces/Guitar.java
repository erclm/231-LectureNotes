public class Guitar extends Instrument {
    private int n_strings;

    public Guitar() {
        super("string");
        this.n_strings = 6;
    }

    public Guitar(int n_strings) {
        super("string");
        this.n_strings = n_strings;
    }

    public void play() {
        System.out.println("strum strum strummm");
    }

    public String toString() {
        return "This is a " + n_strings + " string guitar.";
    }
}