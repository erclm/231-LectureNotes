public class Methods {
  /* 
    METHODS
    - kinda like functions except they are tied to an object/class
    - think about input and output

    - public (access modifier) public/private 
    - static (no calling object)
      - Random and Scanner methods are non-static 
        (randy.nextInt())
      - static methods can just be called on their own
    - return type
      - void means it returns no value
      - non-void methods specify the type of their value
    - method name in camelCase
    - comma separated parameters with each param type and name
  */
  public static void main(String[] args) {
    // call our methods by passing in arguments to the method name
    yell("I love coding"); // static methods require no object
    Methods.yell("I love coding"); // sometimes you will see class name attached 
    yell(); // call the method with no params
    // System.out.println(yell("test")); // function has no return value
    int result = sum(12, 5); // save the return value to a variable
    System.out.println(sum(12, 5)); // print the return value to the console

    int[] numbers = { 10, 10, 10 };
    System.out.println(sum(numbers)); // 30

    int[] numbers2 = numbers;
    zero(numbers2); // sets all values to 0 - modifies the original array

    System.out.println(sum(numbers)); // now the sum is 0

  }

  /* VOID METHODS 
    - typically perform some sort of action
    instead of returning a value
  */
  private static void yell(String message) {
    System.out.println(message.toUpperCase() + "!!!!!");
  }

  /* 
    PARAMETER DEFAULTS 
    are not allowed in Java, but you can accomplish the same functionality
    by using method overloading
  */
 private static void yell() { // equivalent of setting default value to "AHHHHHH"
    // System.out.println("AHHHHHHH!!!");
    yell("AHHHHHHHH");
 }

 /* 
  METHODS THAT RETURN A VALUE
 */
  private static int sum(int n1, int n2) {
    return n1 + n2; // output will be the sum of both params
  }

  // cannot have overloaded method that just differs in return type
  // private static double sum(int n1, int n2) {
  //   return (double) n1 + n2;
  // }

  /* 
  METHOD OVERLOADING
  - allows you to have multiple variations of the same method name
  - must differ in parameters (either type or # of params)
  - different return type is allowed
  */
 private static int sum(int[] nums) {
  // create a sum variable to keep track of current sum
  int total = 0;
  // loop through each element in our array and add it to the sum
  for (int i : nums) {
    total += i;
  }
  // once we are done, return the sum variable
  return total;
 }


 /* 
  PASSING IN PRIMITIVES VS REFERENCES
  - primitive types are passed into methods by value/copy
    (modifying arguments does not change initial value)
  - objects & arrays are passed by reference
    (if you modify the object within the method, it changes the original)
    - usually you want this to happen, 
    but if you don't you should make a copy before mdoifying
//  */
//   private static int[] zero(int[] arrayToClear) {
//     // loop through the array and change each value to 0
//     // return the modified array
//     for (int i=0; i <arrayToClear.length; ++i) {
//       arrayToClear[i] = 0;
//     }
//     return arrayToClear;
//   }

// this one uses the original to create a second array
// so that the original is unmodified
private static int[] zero(int[] arrayToClear) {
  int[] newArray = new int[arrayToClear.length];
  for (int i=0; i <newArray.length; ++i) {
    newArray[i] = 0;
  }
  return newArray;
}


}