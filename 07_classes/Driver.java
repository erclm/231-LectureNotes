public class Driver {
  public static void main(String[] args) {
    Canvas c = new Canvas(10, 10);
    System.out.println(c);
    Point p = new Point('&');
    Point p2 = new Point('$', 5, 8);
    System.out.println(p);
    System.out.println(p2);

    c.addCharacter(p2);
    c.addCharacter(p);
    System.out.println(c);
  }
}