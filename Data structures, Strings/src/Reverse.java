import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class Reverse {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter me a string, and I will reverse it");
        String input = scanner.nextLine();
        String reversed = "";

        int lenght = input.length();
        for (int i = lenght-1; i>=0; i--) {
           reversed = reversed + input.charAt(i);
        }
        System.out.println(reversed);

    }
}
