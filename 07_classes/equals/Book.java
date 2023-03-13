public class Book {
    // private member variables
    private String title;
    private String author;
    // if you have another Object as a member variable
    // you would have to create a totally new object of that
    // to create a Deep Copy of your object
    // private Author author; (example)
    private boolean isAvailable;
    /* 
        Static Member Variables
        - instead of being unique to each object instance,
        static member variables are shared between all instances 
        of a class
        - the final keyword, that will make a variable a constant
        so its value cannot be changed
    */
    public static int booksOnPlatform = 0;
    public static final String GENRE = "YA Fiction";

    // constructors (default and overloaded and copy)
    public Book() {
        this.title = "The Color Purple";
        this.author = "Alice Walker";
        this.isAvailable = true;
        booksOnPlatform++;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
        booksOnPlatform++;
    }

    // deep copy - totally new object with totally new
    // object member variables (no shared references)
    // shallow copy - new object but some references are shared
    public Book(Book bookToCopy) {
        this.title = bookToCopy.title;
        this.author = bookToCopy.author;
        // this.author = new Author(bookToCopy.author);
        this.isAvailable = bookToCopy.isAvailable;
        booksOnPlatform++;
    }

    // accessors and mutators
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newValue) {
        this.title = newValue;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void setAvailable(boolean availability) {
        this.isAvailable = availability;
    }

    // toString method 
    public String toString() {
        return "~~~~~~~~~~~~~~~~~~~~~~\n"
        + this.title + " by " + this.author
        + "\nAvailable to Rent: " + this.isAvailable
        + "\n~~~~~~~~~~~~~~~~~~~~~~";
    }
    // equals method
    // defines what it means for two books to be equal
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
            // && this.isAvailable == otherBook.isAvailable;
        }
    }
}