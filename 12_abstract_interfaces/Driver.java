import java.util.ArrayList;
import java.util.Collections;

public class Driver {
    public static void main(String[] args) {
        // error: Instrument is abstract; cannot be instantiated
        // Instrument i = new Instrument();

        Drums d = new Drums();
        System.out.println(d);
        d.play();

        Guitar g = new Guitar();
        g.play();

        g.checkOut();
        g.checkOut(); // shouldn't work
        g.checkIn();

        d.checkOut();
        d.checkIn();

        ArrayList<Drums> drumline = new ArrayList<Drums>();
        drumline.add(new Drums(7));
        drumline.add(new Drums(3));
        drumline.add(new Drums(5));

        System.out.println(drumline);

        Collections.sort(drumline); // sort our List in place using our compareTo method
        System.out.println(drumline);
    }
}