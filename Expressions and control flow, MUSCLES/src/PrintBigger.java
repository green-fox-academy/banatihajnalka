import java.util.Scanner;

public class PrintBigger {
    public static void main(String[] args) {
        // Write a program that asks for two numbers and prints the bigger one

        System.out.println("Give me a number:");
        Scanner scanner1 = new Scanner(System.in);
        int userInput1 = scanner1.nextInt();

        System.out.println("Give me one more number:");
        Scanner scanner2 = new Scanner(System.in);
        int userInput2 = scanner1.nextInt();

        if (userInput1 > userInput2) {
            System.out.println("userInput1 > userInput2");
        } else {
            System.out.println("userInput1 < userInput2");
        }

    }
}
