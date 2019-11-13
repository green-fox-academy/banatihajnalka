import java.util.Scanner;

public class DrawSquare {
    // %%%%%%
    // %    %
    // %    %
    // %    %
    // %    %
    // %%%%%%
    public static void main(String[] args) {
        System.out.println("Give me a number:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            String currentString = "";
            if (i == 0 || i + 1 == size) {
                for (int j = 0; j < size; j++) {
                    currentString += "%";
                }
            } else {
                for (int k = 0; k < size; k++) {
                    if (k == 0 || k + 1 == size) {
                        currentString += "%";
                    } else {
                        currentString += " ";
                    }
                    }
                }
                System.out.println(currentString);
            }
        }
    }
