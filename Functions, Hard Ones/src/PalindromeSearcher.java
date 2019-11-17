import java.util.*;

public class PalindromeSearcher {
    public static void main(String[] args) {
        // It should take a string,
        // search for palindromes that at least 3 characters long and return a list with the found palindromes.

        System.out.println("Write me something.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        ArrayList<String> palindrome = searchPalindromeFunction(input);
        System.out.println(palindrome);

        }

    private static ArrayList<String> searchPalindromeFunction(String input) {
        System.out.println("function start");
        StringBuilder inputSB = new StringBuilder(input);
        StringBuilder rev = new StringBuilder();
        ArrayList<String> palindrome = new ArrayList<String>();
        if (input.length() < 3) {
            System.out.println("ERROR: too short string input");
            return palindrome;
        } else {
            for (int currentLen = 3; currentLen <= input.length(); currentLen++) {
                System.out.println("\n\ncurrLen: " + currentLen);
                for (int currentPos = 0; currentPos <= input.length() - currentLen; currentPos++) {
                    System.out.println("\ncurrPos: " + currentPos);
                    String plainStr = inputSB.substring(currentPos, currentPos+currentLen);
                    StringBuilder plain = new StringBuilder(inputSB.substring(currentPos, currentPos+currentLen));
                    System.out.println("PLAIN Str:" + plainStr);
                    rev = plain;
                    rev.reverse(); // why reversing plain here?
                    System.out.println("REVERSE: " + rev.toString());

                    if (rev.toString().equals(plainStr)) {
                        System.out.println("HOPP EGY PALINDROM");
                        palindrome.add(plain.toString());
                    }
                }
            }
            return palindrome;
        }
    }

}
