/* 
    Abstract Class Instrument
*/
public abstract class Instrument implements Rentable {
    private String category;
    private boolean isAvailable; // use this to determine if an item can be checked out

    public Instrument() {
        category = "brass";
        isAvailable = true;
    }

    public Instrument(String category) {
        this.category = category;
        isAvailable = true;
    }

    // abstract methods do not have a method body in the parent
    // force the children to provide the implementation
    public abstract void play();

    public boolean checkIn() {
        System.out.println("Thanks for returning your instrument!");
        isAvailable = true;
        return true;
    }

    public boolean checkOut() {
        if (isAvailable) {
            System.out.println("Enjoy this instrument!");
            this.isAvailable = false;
            return true;
        } else {
            System.out.println("That instrument is not available.");
            return false;
        }
    }

    public void tune() {
        System.out.println("Instrument is now in tune");
    }
}