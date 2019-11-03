import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int userInput = scanner.nextInt();
        System.out.println(sumAll(userInput));
    }

    private static int sumAll(int in) {
        int sum = 0;
        for (int i = 1; i <= in; i++) {
            sum += i;
        }
        return sum;
    }
}
