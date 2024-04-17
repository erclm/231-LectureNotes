/**
 * Student
 * 
 */
import java.util.*;
public class Student {
    private String name;
    private double gpa;
    public String[] courses;

    //1.Default Constructor
    public Student(){
        this.name = "";
        this.gpa = 3.0;
        this.courses = new String[0];
    }
    
    //2.Parameterized Constructor
    public Student(String name, double gpa){
        this.name = name;
        this.gpa = gpa;
        this.courses = new String[0];
    }

    // 3. Copy constructor
    public Student(Student other) {
        this.name = other.getName();
        this.gpa = other.getGpa();
        this.courses = other.courses.clone();
    }

    // Necessary Accessors
    public String getName(){
        return this.name;
    }
    public double getGpa(){
        return this.gpa;
    }

    // 4. equals method
    public boolean equals(Object inpObject){
        if(this == inpObject){
            return true;
        }else if(inpObject == null || this.getClass() != inpObject.getClass()){
            return false;
        }
        Student compare = (Student) inpObject;
        return Double.compare(this.gpa, compare.getGpa())==0 && this.name.equals(compare.getName());
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Student Name").append(this.name).append("gpa: ").append(this.gpa).append("./n");
        return sb.toString();
    }
    
}