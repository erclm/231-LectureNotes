/**
 * CourseEnrollment
 * Create a CourseEnrollment class with the following member variables: student (a Student object), courseName (String), and grade (double).
Implement the necessary constructors, getters, setters, toString(), and equals() methods for the CourseEnrollment class.
 */
public class CourseEnrollment {
    private Student myStudent;
    private String courseName;
    private double grade;
    
    public CourseEnrollment(){
        this.myStudent = new Student();
        this.courseName = "";
        this.grade = 1;
    }

    public CourseEnrollment(Student inpStudent, String inpCourseName, double inpGrade){
        this.pizza = new (inpStudent);
        this.courseName = inpCourseName;
        this.grade = inpGrade;
    }

    public boolean equals(Object inpObject){
        if(this == inpObject){
            return true;
        }else if(inpObject == null || this.getClass() != inpObject.getClass()){
            return false;
        }

        CourseEnrollment inpCourseEnrollment = (CourseEnrollment) inpObject;
        return Double.compare(this.grade, inpCourseEnrollment.getGrade()) == 0 && this.courseName.equals(inpCourseEnrollment.getCourseName()) && this.myStudent.equals(inpCourseEnrollment.getStudent());

    }
}
