import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userInput = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + userInput + " = " + (i * userInput));
        }


    }
}
