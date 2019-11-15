import java.util.Scanner;

public class CreatePalindrome {
    public static void main(String[] args) {
        System.out.println("Write me something.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

       StringBuilder palindrome = new StringBuilder();
       StringBuilder rev = new StringBuilder();
       palindrome.append(input);
       rev.append(input).reverse();
       palindrome.append(rev);
       System.out.println(palindrome);



    }
}

