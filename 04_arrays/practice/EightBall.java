import java.util.Random;
import java.util.Scanner;
public class EightBall {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random randy = new Random();
        String[] responses = {
            "Yes",
            "No",
            "Perhaps",
            "It does not appear that way",
            "If you are lucky, yes"
        };

        for (int i=0; i<3; ++i) {
            int randomIndex = randy.nextInt(responses.length);

            System.out.print("Ask me a question: ");
            in.nextLine();

            System.out.println(responses[randomIndex]);
        }
        
    }
}