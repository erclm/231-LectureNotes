public class Driver {
    public static void main(String[] args) {
        Book basic = new Book(); 
        Book dandelion = new Book("Dandelion Wine", "Ray Bradbury");

        // copying a reference to the same object
        Book copy = dandelion; 
        // creating a totally new object
        // with all the same values
        Book deepCopy = new Book(dandelion); 
        deepCopy.setAvailable(false);

        // System.out.println(basic);
        // System.out.println(dandelion);
        // System.out.println(deepCopy);

        System.out.println(dandelion.equals(basic));

        System.out.println("Number of Books Created: " + Book.booksOnPlatform);
        System.out.println(Book.GENRE);
    }   
}