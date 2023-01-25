import java.io.*;
public class Test implements java.io.Serializable {
  private int i;

  public Test() {
    i = 0;
  }

  public String toString(){
    return " " + i;
  }
}