import java.util.Scanner;

public class OneTwoALot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me a number.");
        int UserInput = scanner.nextInt();
        if (UserInput < 0) {
            System.out.println("Not enough");
        } else if (UserInput == 1) {
            System.out.println("One.");
        } else if (UserInput == 2) {
            System.out.println("Two.");
        } else {
            System.out.println("A lot.");
        } }
            }
