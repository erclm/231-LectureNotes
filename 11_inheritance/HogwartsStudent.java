import java.util.Random;
public class HogwartsStudent extends Wizard {
    private String house;
    private boolean playsQuidditch;
    public static String[] houses = { "Gryffindor", "Ravenclaw", "Hufflepuff", "Slytherin" };
    public static Random randy = new Random();
    
    public HogwartsStudent() {
        // we have to construct the parent using super
        super(); // uses default constructor - Wizard()
        this.playsQuidditch = false;
        int randomIndex = randy.nextInt(houses.length);
        this.house = houses[randomIndex];
    }

    public HogwartsStudent(String name, int age, String house) {
        // we can accept the values for the parent constructor
        // in the child constructor
        super(name, age); // call overloaded constructor of Wizard
        this.house = house;
        this.playsQuidditch = false;
    }

    public String toString() {
        // we can use super to access the methods or variables of the parent
        return "Name: " + super.getName() + "\nHouse: " + this.house; 
    }

    // override the expelliarmus method on Wizard
    // because you can't use that spell at Hogwarts
    public void expelliarmus() {
        System.out.println("That spell is not allowed here!");
    }



}