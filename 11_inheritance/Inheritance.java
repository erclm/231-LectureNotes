import java.util.ArrayList;

public class Inheritance {
  public static void main(String[] args) {
    Wizard p = new Wizard();
    System.out.println(p);

    HogwartsStudent s = new HogwartsStudent();
    System.out.println(s);

    HogwartsStudent cedric = new HogwartsStudent("Cedric Diggory", 18, "Hufflepuff");
    System.out.println(cedric);

    // calling the overridden method on both objects
    // what type of object it is determines which method body is executed

    p.expelliarmus();
    s.expelliarmus();

    ArrayList<HogwartsStudent> students = new ArrayList<HogwartsStudent>();
    // Cannot cast down Wizard -> HogwartsStudent
    // students.add(p);
    students.add(s);
    students.get(0).expelliarmus();

    ArrayList<Wizard> wizards = new ArrayList<Wizard>();
    wizards.add(p);
    // you CAN cast up (HogwartsStudent -> Wizard)
    wizards.add(s);

    wizards.get(0).expelliarmus();

    // notice how even though it is stored in a Wizard ArrayList
    // the overriden method gets called
    // because the object is ALSO a HogwartsStudent
    // this is LATE BINDING
    // because Java figures out what method body to execute at runtime instead of
    // compile time
    wizards.get(1).expelliarmus();

  }
}