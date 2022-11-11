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
    System.out.println("badum pschhh");
  }

  public String toString() {
    return n_pieces + " piece kit";
  }

  public int compareTo(Drums other) {
    return this.n_pieces - other.n_pieces;
  }
}