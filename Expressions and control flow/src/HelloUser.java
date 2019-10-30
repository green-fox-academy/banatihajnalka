import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please tell me your name: ");
        String UserInput1 = scanner.nextLine();
        System.out.println("Your name is: " + UserInput1 + ".");
    }
}
