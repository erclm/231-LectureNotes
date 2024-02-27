package midterm_1_review;


public class Weekends {
    public static String getDayName(int dayOfWeek) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        if (dayOfWeek < 0 || dayOfWeek > 6) { //handle invalid numbers
          return "Invalid input";
        }
        
        return days[dayOfWeek];//return correct day
      }
    public static void main(String[] args) {
        int dayNumber = 5;//input
        System.out.println("The day name is: " + getDayName(dayNumber)); // Output: The day name is: Friday
    }
}
