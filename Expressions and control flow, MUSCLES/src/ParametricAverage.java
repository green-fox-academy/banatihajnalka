import java.util.Scanner;

public class ParametricAverage {
    public static void main(String[] args) {
        // Write a program that asks for a number.
        // It would ask this many times to enter an integer,
        // if all the integers are entered, it should print the sum and average of these
        // integers like:
        //
        // Sum: 22, Average: 4.4

        System.out.println("Give me a number");
        Scanner scanner = new Scanner(System.in);
        int askTimes = scanner.nextInt();

        int sum = 0;
        double avg = 0;
        int n = 0;

        for (int i = 0; i < askTimes; i++) {
            String num;
            if (i + 1 == askTimes) {
                num = "";
            } else {
                num = "s";
            }
            System.out.println("Give me "  + (askTimes - i) + " number" + num + ".");
            Scanner scanner2 = new Scanner(System.in);
            n = scanner.nextInt();
            sum += n;
            avg = sum/askTimes;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);



    }
}
