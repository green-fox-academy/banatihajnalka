import java.util.Random;
import java.util.Scanner;

public class GuessMyNumber {
//    Write a program where the program chooses a number between 1 and 100. The player is then asked to enter a guess. If the player guesses wrong, then the program gives feedback and ask to enter an other guess until the guess is correct.
//    Make the range customizable (ask for it before starting the guessing).
//    You can add lives. (optional)
//    I've the number between 1-100. You have 5 lives.
//            > 20
//    Too high. You have 4 lives left.
//            > 10
//    Too low. You have 3 lives left.
//            > 15
//    Congratulations. You won!

    public static void main(String[] args) {

        System.out.println("Choose the range: ");
        Scanner scanner = new Scanner(System.in);
        int bound = scanner.nextInt();
        Random random = new Random();
        int randomNumber = random.nextInt(bound);
        int life = 5;
        System.out.println("I have a number between 0 and " + bound + ". You have 5 lives.");


        while (life >= 0) {
            if (life == 0) {
                System.out.println("You lost the game.");
                break;
            }
            System.out.println("Guess a number.");
            Scanner number = new Scanner(System.in);
            int guess = scanner.nextInt();
            System.out.println("Your guess now is: " + guess);
            if (guess == randomNumber) {
                System.out.println("Congratulations. You won!");
                break;
            } else if (guess < randomNumber) {
                life--;
                System.out.println("Too low. You have " + life + " lives left");
            } else if (guess > randomNumber) {
                life--;
                System.out.println("Too high. You have " + life + " lives left");
            }
        };


    }
}
