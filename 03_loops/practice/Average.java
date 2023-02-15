import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double nextGrade = 0;

        System.out.print("Enter a grade (enter -1 to quit): ");
        nextGrade = in.nextDouble();

        while (nextGrade != -1) {
            total += nextGrade;
            count++;
            System.out.print("Enter a grade (enter -1 to quit): ");
            nextGrade = in.nextDouble();
        }

        System.out.println("The average was " + total / count);
    }
}