import java.util.Scanner;

public class CountFromTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give me two numbers: ");
        int userInput = scanner.nextInt();
        int userInput2 = scanner.nextInt();
        while (userInput > userInput2) {
            System.out.println("The second number should be bigger");
        }
        for (int i = userInput; i < userInput2; i++){
            System.out.println(userInput++);
        }
    }
}
