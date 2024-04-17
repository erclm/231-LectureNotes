/* 
 * static & final
 * 
 * Static <- belongs to a class
 * normally when creating an object: Student a = new Student();
 * Exmaple for this is Random.xxx methods
 * Random.nextInt()
 * 
 * 
 * MyClass.java.
 * - static int abc
 * - static void doSomething()
 * 
 * Mainclass.java
 * - main()
 * -- MyClass.doSomething()
 * -- MyClass.abc
 * 
 * 
 * final <- definitions. immutable. 
 * MyClass
 * - definitions (final) A = 1;
 * extends MyClassTwo
 * - A = 2 (x)
 */


 /**
  * mainclass
  */
 public class mainclass {
 
    public static void main(String[] args) {
        MyClass.doSomething();

        int b = 10 + ACE; 
        return;
        

    }
 }