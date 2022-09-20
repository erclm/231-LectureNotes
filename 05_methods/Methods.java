public class Methods {
  /*
   * This is your main method
   * that takes in a String array as a param
   * and returns nothing (void)
   * 
   * It is public,
   * meaning it has no access restrictions
   * and static,
   * meaning you do not need a "calling object"
   * to use the method.
   * (think how we use Scanner vs how we use Math)
   */
  public static void main(String[] args) {
    /*
     * this is the method body
     * we can call other methods from within this method body
     */
    System.out.println(Methods.sum(12, 5));
    int[] nums = { 4, 8, 15, 16, 23, 42 };
    System.out.println(Methods.sum(nums));
    // since yell() is a void method, we just call it
    Methods.yell("I love methods");

    int[] cleared = Methods.zero(nums);

    System.out.print("[");
    for (int i = 0; i < cleared.length; ++i) {
      System.out.print(cleared[i] + ",");
    }
    System.out.println("]");

    // we check the value of nums now, it is also cleared
    System.out.println(Methods.sum(nums));
    System.out.print("[ ");
    for (int i = 0; i < nums.length; ++i) {
      System.out.print(nums[i] + " ");
    }
    System.out.println("]");

    Methods.yell();
  }

  /* VOID METHODS
   * a void message returns no value,
   * it only performs a function
   */
  private static void yell(String message) {
    System.out.println(message.toUpperCase() + "!!!!!");
  }

  /* METHODS THAT RETURN A VALUE
   * our new method add,
   * that takes in two integers as params
   * and returns a single integer
   */
  private static int sum(int n1, int n2) {
    return n1 + n2;
  }

  /*
   * OVERLOADED METHODS
   * - in Java, you can have multiple methods with the same name
   * - must differ in type or number of params, not just return type
   * - binding is the process of connecting a method call with its body
   * - overloaded methods that are private and/or static
   * are an example of "early-binding" because the binding happens
   * at compile time. We will learn about "late-binding" later.
   */
  private static int sum(int[] nums) {
    int sum = 0;
    for (int i : nums) {
      sum += i;
    }
    return sum;
  }

    /* 
    YOU CANNOT SET DEFAULT PARAMETERS IN JAVA
    but you can use an overloaded method to essentially
    do the same thing
  */
  private static void yell() {
    System.out.println("AHHHHHHH!!!!!!");
  }

  /**
   * PASSING BY REFERENCE VS VALUE
   * Primitive types are passed into methods by value. Modifying them
   * within the method won't modify the original value that was passed in. This is
   * NOT the same for objects or other reference types (like arrays)
   * Objects and other reference types are passed by REFERENCE, meaning you will
   * modify the object in place within the method unless you make a copy
   */
  private static int[] zero(int[] arrayToClear) {
    int[] newArray = arrayToClear; // still not a new array
    for (int i = 0; i < newArray.length; ++i) {
      newArray[i] = 0;
    }
    return newArray;
  }

}