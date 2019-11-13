import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {
        // Write a program that asks for 5 integers in a row,
        // then it should print the sum and the average of these numbers like:
        //
        // Sum: 22, Average: 4.4


        int askTimes = 5;
        int n = 0;
        int sum = 0;
        int avg = 0;

        for (int i = 0; i < askTimes; i++ ) {
            System.out.println("Give me 5 numbers: ");
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            sum += n;
            avg = sum/5;

        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + avg);



    }
}
