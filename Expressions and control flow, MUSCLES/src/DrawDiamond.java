import java.util.Scanner;

public class DrawDiamond {
    //    *
    //   ***
    //  *****
    // *******
    //  *****
    //   ***
    //    *
    public static void main(String[] args) {
        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 1; i < size; i += 2) {
            for (int k = size; k >= i; k -= 2) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }// end loop

        for (int i = 1; i <= size; i += 2) {
            for (int k = 1; k <= i; k += 2) {
                System.out.print(" ");
            }
            for (int j = size; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

                }
            }
        }
