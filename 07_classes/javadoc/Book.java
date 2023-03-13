/** A representation of a Book within a library program
  * where books can be checked out and then returned. Holds 
  * member variables for title and author and availability, and
  * keeps a running tally of all books that have been created. 
  * Note: All Books are under the genre "YA Fiction"
  * @author Murphy Studebaker
  * @version 1.0
 */
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    /** A running tally of the number of Books that have been constructed  */
    public static int booksOnPlatform = 0;
    /** All Books on the platform share the same genre of "YA Fiction" */
    public static final String GENRE = "YA Fiction";

    /** Default Constructor creates an Object for the Book
      * The Color Purple by Alice Walker. 
      * (all Books are immediately available to rent after creation)
     */
    public Book() {
        this.title = "The Color Purple";
        this.author = "Alice Walker";
        this.isAvailable = true;
        booksOnPlatform++;
    }

    /** Overload Constructor accepts values for the 
      * title and author of the Book
      * @param title the String representation of the title
      * @param author the string representation of the Book's author
      * (if multiple authors, pass in a comma separated String of names)
     */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        booksOnPlatform++;
    }

    /** Copy Constructor creates a duplicate Book Object
      * @param bookToCopy the Book Object of which to duplicate
     */
    public Book(Book bookToCopy) {
        this.title = bookToCopy.title;
        this.author = bookToCopy.author;
        this.isAvailable = bookToCopy.isAvailable;
        booksOnPlatform++;
    }

    /** Accessor for the String representation of the title
     * @return the String representation of the Book's title
     */
    public String getTitle() {
        return this.title;
    }

    /** Mutator for the String representation of the tile
      * @param newValue the new String representation of the title
     */
    public void setTitle(String newValue) {
        this.title = newValue;
    }

    /** Accessor for the Book's author
     * @return the String representation of the Book's author(s)
     */
    public String getAuthor() {
        return this.author;
    }

    /** Mutator for the Book's author
     * @param newAuthor the new String representation of the author
     * (if multiple, pass in a comma separated String of names)
     */
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    /** The accessor for the boolean representation of
     * whether or not the Book is currently checked in or out
     * @return true if available, false if not available
     */
    public boolean isAvailable() {
        return this.isAvailable;
    }

    /** Mutator for the boolean representation of whether or not
     * the book is currently available to be checked out
     * @param availability true if available, false if not available
     */
    public void setAvailable(boolean availability) {
        this.isAvailable = availability;
    }

    /** The textual representation for a Book includes
     * all private member variables and a decorative border
     * @return the textual representation of the Book as a String
     */
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~\n"
        + this.title + " by " + this.author
        + "\nAvailable to Rent: " + this.isAvailable
        + "\n~~~~~~~~~~~~~~~~~~~~~~";
    }

    /** the equals method comparing a Book to other Objects
      * Two Books are considered equal if their titles and authors match. 
      * Availability is not considered when determining equivalence.
      * @param o the Object with which to compare the Book
      * @return true if the Book and Object are equivalent, false if not
     */
    public boolean equals(Object o) {
        if (!(o instanceof Book)) {
            // the object cannot be a book
            return false;
        } else {
            // the object CAN be a book
            // "down-cast" o from an Object -> Book
            Book otherBook = (Book) o;
            // return true if the titles and authors match
            // and false if not
            return this.title.equals(otherBook.title)
            && this.author.equals(otherBook.author);
        }
    }
}