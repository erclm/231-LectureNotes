public class Driver {
  public static void main(String[] args) {
    // create an instance of Canvas using the default constructor
    Canvas square = new Canvas();
    // create an instance of Canvas using the overloaded constructor
    Canvas rectangle = new Canvas(20, 15);

    rectangle.addCharacter('&',4,5);

    System.out.println(square);
    System.out.println(rectangle);
  }
}