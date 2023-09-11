import java.util.ArrayList;
public class Driver {
    public static void main(String[] args) {
        Wizard wiz = new Wizard();
        System.out.println(wiz);
        wiz.expelliarmus();

        HogwartsStudent harry = new HogwartsStudent();
        HogwartsStudent cedric = new HogwartsStudent("Cedric Diggory", 18, "Hufflepuff");

        System.out.println(harry);
        System.out.println(cedric);

        harry.expelliarmus();

        String[] valueNames = { "Two", "Three", "Four"}

        ArrayList<Wizard> wizards = new ArrayList<Wizard>();
        wizards.add(wiz); // would not be able to go from Wizard -> HogwartsStudent
        wizards.add(harry); // upcasting harry from a HogwartsStudent -> Wizard
    
        wizards.get(0).expelliarmus(); // call on Wizard
        wizards.get(1).expelliarmus(); // call on HogwartsStudent
        
    }
}