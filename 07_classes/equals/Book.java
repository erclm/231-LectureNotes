public class Book {
    private String title;
    private String author;
    private boolean isAvailable;
    // private String[] genres;

    public Book() {
        this.title = "The Color Purple"; // OR null
        this.author = "Alice Walker"; // OR null
        this.isAvailable = true;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }

    // copy constructor makes a duplicate of your object
    public Book(Book bookToCopy) {
        // deep vs shallow copies
        // shallow copy means a two objects share some references
        // deep copy means you create a completely new object with no shared references
        // this.genres = bookToCopy.genres; // shallow copy
        // this.genres = new String[bookToCopy.genres.length] // deep copy
        // for (int i=0; i < this,.genres.length; ++i) {
        //     this.genres[i] = bookToCopy.genres[i];
        // }
        this.title = bookToCopy.title; // bookToCopy.getTitle()
        this.author = bookToCopy.author;
        this.isAvailable = bookToCopy.isAvailable;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
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

    public void setAvaialable(boolean available) {
        this.isAvailable = available;
    }

    public String toString() {
        return this.title + " by " + this.author 
        + "\n~~~~~~~~~~~~~~~~~~\n"
        + "Available to Rent: " + isAvailable;
    }

    public boolean equals(Object o) {
        // see if the Object is a Book
        if (!(o instanceof Book)) {
            return false; // not a book
        } else {
            // can be a book
            // type-cast our parameter o Object -> Book ("downcasting")
            Book other = (Book) o;
            // two books are equal if their titles and authors match
            return other.title.equals(this.title) 
            && other.author.equals(this.author);
        }
    }

    public static void main(String[] args) {
        Book defaultBook = new Book();
        Book overstory = new Book("The Overstory", "Richard Powers");
        Book copy = new Book(defaultBook);
        System.out.println(defaultBook.equals(copy));


        // overstory.setAvaialable(false);

        // Book copy = new Book(overstory); // deep copy - completely new object
        // Book notADeepCopy = overstory; // shallow copy - new variable, points to same object

        // // System.out.println(defaultBook);
        // System.out.println(overstory);
        // System.out.println(copy);
    }
}