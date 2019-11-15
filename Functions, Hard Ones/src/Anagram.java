import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String first = scanner.nextLine();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Give me a word: ");
        String second = scanner.nextLine();

        boolean areAnagram = anagramFunction(first, second);
        System.out.println("Are they anagrams? " + areAnagram);
    }

    private static boolean anagramFunction(String first, String second) {
        boolean areAnagrams = false;
        first = first.toLowerCase();
        second = second.toLowerCase();
        if (first.length() != second.length()) {
            System.out.println("These can not be anagrams.");
            return areAnagrams;
        }
        char[] firstChar = first.toCharArray();
        char[] secChar = second.toCharArray();
        Arrays.sort(firstChar);
        String sortedFirst = new String(firstChar);
        Arrays.sort(secChar);
        String sortedSecond = new String(secChar);
        if (sortedFirst.equals(sortedSecond)) {
            System.out.println("They have the same length and characters.");
            areAnagrams = true;
        }
        return areAnagrams;
    }
}
