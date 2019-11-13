import java.sql.SQLOutput;
import java.util.Scanner;

public class DrawPyramid {
    // Write a program that reads a number from the standard input, then draws a
    // pyramid like this:
    //
    //    *
    //   ***
    //  *****
    // *******
    //
    // The pyramid should have as many lines as the number was

    public static void main(String[] args) {

        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0; i <= rows; i++) {
            for (int j = 0; j < rows - 1; j++) {
  //              System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
