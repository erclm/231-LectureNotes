import java.util.Scanner;

public class ScreenTime {
  public static void main(String[] args) {
    // to get user import, we have to create a Scanner object
    // (make sure you have imported Scanner above)
    Scanner userInput = new Scanner(System.in);

    // now we prompt the user and save their response to a variable
    System.out.print("Minutes spent on your phone yesterday: ");
    // we use the nextInt method on the Scanner object we created
    // to get the input as an integer
    int screenTime = userInput.nextInt();

    // now do some simple math and print the result
    System.out.println("In a week, you'll spend " + (screenTime * 7) / 60 + " hours and " + (screenTime * 7) % 60 + " minutes on your phone.");
    System.out.println("In a month, you'll spend "  + (screenTime * 30) / 60 + " hours and " + (screenTime * 30) % 60 + " minutes on your phone.");
    System.out.println("In a year, you'll spend " + (screenTime * 365) / 60 + " hours and " + (screenTime * 365) % 60 + " minutes on your phone.");

  /* Life Percentage Bonus Challenge */
  // we make some constants based on assumptions
  int YEARS_ALIVE = 80;
  int YEARS_WITH_PHONE = YEARS_ALIVE - 16;

  // we will want these as doubles so the result of division
  // is a double without any loss of precision
  // here we cast screenTime (an integer) so that it's a double
  double dailyScreenMins = (double) screenTime;
  double dailySleepMins = 8 * 60;
  double dailyOtherMins = (60 * 24) - (dailyScreenMins + dailySleepMins);        
        
  double totalMinutesAlive = ((60 * 24) * 365) * YEARS_ALIVE; 
  double totalMinutesSleeping = (dailySleepMins * 365) * YEARS_ALIVE;
  double totalMinutesScreen = (dailyScreenMins * 365) * YEARS_ALIVE;
  double totalMinutesOther = (dailyOtherMins * 365) * YEARS_ALIVE;

  double percentScreenTime = (totalMinutesScreen / totalMinutesAlive ) * 100;
  double percentSleepTime = (totalMinutesSleeping / totalMinutesAlive ) * 100;
  double percentOtherTime = (totalMinutesOther / totalMinutesAlive ) * 100;

  System.out.println("You will spend " +  percentScreenTime + "% of your life on your phone.");
  System.out.println("You will spend " +  percentSleepTime + "% of your life asleep.");
  System.out.println("You will spend " +  percentOtherTime + "% of your life actually living.");
  }
}