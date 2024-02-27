package midterm_1_review;

public class maxMin {
    public static int differenceBetweenHighestAndLowest(int[] grades) {
        if (grades.length == 0) {
          throw new IllegalArgumentException("Array cannot be empty");
        }
      
        int minGrade = Integer.MAX_VALUE;
        int maxGrade = Integer.MIN_VALUE;
      
        for (int grade : grades) {
          minGrade = Math.min(minGrade, grade);
          maxGrade = Math.max(maxGrade, grade);
        }
      
        return maxGrade - minGrade;
    }
    public static void main(String[] args) {
        //implement test
    }
}
