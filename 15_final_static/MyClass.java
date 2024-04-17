package 15_final_static;

public class MyClass {
    public static final int ACE = 13;

    public final int MyNumber = 43;

    public static int abc = 10;

    public MyClass(){
        //nothing
    }

    public static void doSomething(){
        System.out.print("Hello World");
        
    }

    public final void doMore(){
        System.out.print(MyNumber + 10);
    }

    public int abc(){
        return 1;
        System.err.println("hello");
    }
}
