import java.util.Scanner;

public class DrawDiagonal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me a number.");
        int userInput = scanner.nextInt();

        for (int i = 0; i <= userInput; i++) {
            for (int j = userInput; j < i; j++) {
                System.out.print("% ");
            }
            System.out.println();
        }
    }
}