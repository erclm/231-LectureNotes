import java.util.Random;
public class CLI {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("You did not provide the required arguments.");
            System.exit(1);
        }
        Random randy = new Random();
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);
        int generated = randy.nextInt(max-min) + min;
        System.out.println("Generated number between " + min + " and " + max);
        System.out.println(generated);
    }
}