public class Wizard {
    private String name;
    private int age;

    public Wizard() {
        name = "Harry Potter";
        age = 0;
    }

    public Wizard(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String toString() {
        return this.name +", age " + this.age;
    }

    public void expelliarmus() {
        System.out.println("EXPELLIARMUS!!!!");
    }
}