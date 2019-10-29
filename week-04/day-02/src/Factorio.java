import java.util.Scanner;

public class Factorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userInput = scanner.nextInt();
        System.out.println(factorialFunction(userInput));
    }

    private static int factorialFunction(int userInput) {
        int fact = 1;
        for (int i = 1; i <= userInput; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
