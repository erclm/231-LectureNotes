/** A representation of a book within a library program where
  * books can be checked out and then returned. Holds private member variables
  * for title, author, and whether or not it is available to be checked out.
  * Note: All Books are under the genre "YA Fiction" 
  * @author Murphy Studebaker
  * @version 1.0
*/
public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    /** A running tally of the number of Books that have been created */
    public static int booksOnPlatform = 0;
    /** All books on the platform share the same genre of "YA Fiction" */
    public static final String GENRE = "YA Fiction";

    /** Default Constructor creates an object for the book
      * "The Color Purple" by Alice Walker.
      * (all books are immeditaley availavle to rent after creation)
     */
    public Book() {
        this.title = "The Color Purple";
        this.author = "Alice Walker";
        this.isAvailable = true;
        booksOnPlatform++;
    }

    /** Overloaded Constructor accepts values for the Book's title
      * and author
      * @param title the String representation of the book's title
      * @param author the String representation of the book's author
      * (if multiple, pass in a comma separated String of names)
    */
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        booksOnPlatform++;
    }

    /** Copy Constructor creates a duplicate of a given Book Object
      * @param bookToCopy the Book of which to make a copy
     */
    public Book(Book bookToCopy) {
        this.title = bookToCopy.title;
        this.author = bookToCopy.author;
        // this.author = new Author(bookToCopy.author);
        this.isAvailable = bookToCopy.isAvailable;
        booksOnPlatform++;
    }

    /** Accessor for the title of the book
     * @return the String representation of the book's title
     */
    public String getTitle() {
        return this.title;
    }

    /** Mutator for the book's title
     * @param newValue the new String representation of the title
     */
    public void setTitle(String newValue) {
        this.title = newValue;
    }

    /** Accessor for the book's author
     * @return the String representation of the author
     */
    public String getAuthor() {
        return this.author;
    }

    /** Accessor for the book's author
     * @param newAuthor the new Author of the book 
     * (if multiple, provide a comma separated String of names)
     */
    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    /** Accessor for whether or not the book is currently 
      * available to rent 
      * @return true if available, false if unavailable
    */
    public boolean isAvailable() {
        return this.isAvailable;
    }

    /** Mutator for the current availability of the Book
     * @param availability true if the book is available, false if not
     */
    public void setAvailable(boolean availability) {
        this.isAvailable = availability;
    }

    /** Creates a textual representation of the Book including
     * all private member variables and a decorative border
     * @return the textual representation of the book as a String
     */
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~\n"
        + this.title + " by " + this.author
        + "\nAvailable to Rent: " + this.isAvailable
        + "\n~~~~~~~~~~~~~~~~~~~~~~";
    }

    /** Compares a Book to another Object. Two Books are equal
      * if they share the same title and author. Availability is not
      * considered as a measure of equivalence.
      * @param o the Object to compare to this Book
      * @return true if the two Books are the same, false if not
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