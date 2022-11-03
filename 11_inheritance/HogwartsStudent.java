import java.util.Random;

/* 
This is our derived class HogwartsStudents
We extend Wizard because all HogwartsStudents are also Wizards (we are ignoring the whole squib concept)

Inheritance allows us to create object hierarchies from more general objects to more specific objects that all share member variables and methods

This is **INCREDIBLY** useful in software development and allows for a lot of shareable, extendable code.
*/
// to create a derived class, use the "extends" keyword
// remember, you can only extend from one parent class
public class HogwartsStudent extends Wizard {
  String m_house;
  boolean m_playsQuidditch;
  public static String[] houses = { "Gryffindor", "Ravenclaw", "Slytherin", "Hufflepuff" };
  public static final Random randy = new Random();

  public HogwartsStudent() {
    // the super keyword is like "this" but to refer to the parent class
    // here we are using it to call the parent class's default constructor
    // you will almost always use super as the first line in your constructor
    super();
    m_playsQuidditch = false;
    int randomIndex = randy.nextInt(houses.length);
    m_house = houses[randomIndex];
  }

  public HogwartsStudent(String name, int age, String house) {
    // here we only pass name and age into the parent constructor
    super(name, age);
    // the remaining variables we initialize here
    m_house = house;
    m_playsQuidditch = false;
  }

  public String toString() {
    // here we can use super to call the accessor of our parent class's name member
    // variable
    // if the variable was protected, we could just reference it here instead
    return "Name: " + super.getName() + "\nHouse: " + this.m_house + "\nOn Quidditch Team: " + this.m_playsQuidditch;
  }

  public void expelliarmus() {
    System.out.println("That spell is not allowed here...");
  }
}