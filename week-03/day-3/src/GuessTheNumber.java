import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {

        int guessNumber = 17;

        while (true) {

            System.out.println("Please give me a number.");
            Scanner scanner = new Scanner(System.in);
            int userInput = scanner.nextInt();

            if (userInput == guessNumber) {
                System.out.println("You found the number, which is 17.");
                break;
            } else if (userInput < 17) {
                System.out.println("The stored number is higher.");
            } else {
                System.out.println("The stored number is lower.");
            }
        }
    }
}
