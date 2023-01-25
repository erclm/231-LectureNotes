/* 
  All we have to do to be able to write out Objects 
  is implement the Serializable interface

  - no static member variables will be written out
  - no variables with the "transient" modifier will be written out
  - a subclass will inherit the Serializability from the parent
  - if a child implements Serializable but the parent is not serializable, 
  the parent must have a default constructor with no arguments
  - any non-primitive member variables must also be Serializable 
  (or static/transient so they are not written out)
*/
public class Student implements java.io.Serializable {
  private String name;
  private int year;
  private Test t; // an Object member variable must also be serializable

  public Student() {
    name = null;
    year = 1;
    t = new Test();
  }

  public Student(String name, int year) {
    this.name = name;
    this.year = year;
    t = new Test();
  }

  public String toString(){
    return this.name + ": " + this.year + "\n" + t;
  }
}