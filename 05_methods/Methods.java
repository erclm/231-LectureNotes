public class Methods {
  /* 
    Methods
    - thinking about inputs and outputs

    - access modifier (public/private/protected)
      - public means there are no access restrictions
      - private means it can only be executed within the class
      in which it is defined
    - static means you do not need a calling object to execute
    the methods 
      - Scanner and Random methods are NOT static 
    - return type 
      - void means there is nothing returned
      - all returns have to be the same specified type
    - method name (camelCase)
    - inside parentheses is a comma seperated list of parameters
      - each param needs the type and name
  */
  public static void main(String[] args) {
    /* method body */ 
    // Methods.yell("I hate coding"); //method call
    // Methods.yell();

    // Methods.sum(4,5); // evaluate to 9
    // int result = Methods.sum(4,5); // save returned value to variable
    // System.out.println(Methods.sum(4,5)); // pass the result into another method

    int[] numbers = {5,5,5};
    // System.out.println(Methods.sum(numbers));

    int[] clearedArray = Methods.zero(numbers);

    System.out.println("CLEARED ARRAY");
    System.out.print("[");
    for (int i : clearedArray) {
      System.out.print(i + " ");
    }
    System.out.println("]");

    System.out.println("ORIGINAL ARRAY");
    System.out.print("[");
    for (int i : numbers) {
      System.out.print(i + " ");
    }
    System.out.println("]");

  }

  /* VOID METHODS 
    methods that perform an action
    instead of returning a value
  */
  private static void yell(String message) { // method definition
    System.out.println(message.toUpperCase() + "!!!");
  }

  /* 
    Java does not allow you to set default parameters,
    BUT you can accomplish the same thing with overloaded methods
  */
  private static void yell() {
    // wrap the original method
    // with the desired default value passed in
    Methods.yell("AHHHHH");
  }


  /* 
    METHODS THAT RETURN A VALUE
  */
  // write a method that takes in two integers
  // and returns their sum
  private static int sum(int n1, int n2) {
    return n1 + n2;
  }

  /* 
    OVERLOADED METHODS
    - Java allows you to have multiple methods with the same name
    and different expected arguments
    - either differ in types of arguments or number of arguments
    - the return type is allowed to be different but cannot be the only difference
    - process of mapping a method call to the appropriate body is called "binding"
      in Java there is early and late binding, all private/static/overloaded methods
      implement early binding (happens at compile time)
  */
  private static int sum(int[] nums) {
    int total = 0;
    for (int i : nums) {
      total += i;
    }
    return total;
  }

  /* 
    PASSING BY REFERENCE VS VALUE
    - primitive types are passed by value
    (if you modify them, it will not modify the original)
    - reference types (arrays, Objects) are passed by reference
    (will modify the original)
  */
  // private static int[] zero(int[] arrayToClear) {
  //   // modifies the original array in place
  //   for (int i=0; i < arrayToClear.length; ++i) {
  //     arrayToClear[i] = 0;
  //   }
  //   return arrayToClear;
  // }

  private static int[] zero(int[] arrayToClear) {
    // create new array of same length
    // to preserve the original array
    int[] newArray = new int[arrayToClear.length]; 
    for (int i=0; i < newArray.length; ++i) {
      newArray[i] = 0;
    }
    return newArray;
  }






}