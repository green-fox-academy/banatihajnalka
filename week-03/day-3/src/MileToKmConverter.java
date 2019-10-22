import java.util.Scanner;

public class MileToKmConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many miles far is the closest shop next to your house? ");
        double UserInput1 = scanner.nextDouble();
        double conversion = 1.60934;
        System.out.println("So, it is about " + (UserInput1 * conversion) + " kilometers.");
    }
}
