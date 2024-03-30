/*
 * equals(Object obj):
 * Override the equals() method to determine if the current Student object is equal to 
 * another Student object.
 * Two Student objects should be considered equal if their id attributes are the same.
 * If the obj parameter is null or not an instance of Student, return false.
 * If the obj parameter is an instance of Student, compare the id attributes of the 
 * two objects and return true if they are the same, false otherwise.
 */

public class Classes {

    @Override
    public boolean equals(Object a){
        if(a == null){
            return false;
        }else if(a.getClass() != this.getClass()){
            return false;
        }
        Student testStudentObject = (Student) a;
        //this.getabc() == a.getabc()
        int something = (int) a;

    }
    
}