import java.util.Scanner;

public class DivideByZero {
    // Create a function that takes a number
    // divides ten with it,
    // and prints the result.
    // It should print "fail" if the parameter is 0

    public static void main(String[] args) {
        System.out.println("Give me a number: ");
        Scanner scanner = new Scanner(System.in);
        int divisor = scanner.nextInt();

        divideByZeroFunction(scanner, divisor);
}
    private static void divideByZeroFunction(Scanner scanner, int divisor) {
        try {
            int result = 10 / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("fail");
        }
    }
}