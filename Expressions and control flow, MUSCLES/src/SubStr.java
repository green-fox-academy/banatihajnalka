import java.util.Scanner;

public class SubStr {
    public static void main(String[] args) {
        //  Create a function that takes two strings as a parameter
        //  Returns the starting index where the second one is starting in the first one
        //  Returns `-1` if the second string is not in the first one
        //  Example:
        //  should print: `17`
        //     System.out.println(subStr("this is what I'm searching in", "searching"));
        //  should print: `-1`
        //     System.out.println(subStr("this is what I'm searching in", "not"));

        System.out.println("Give me a string.");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Give me another string.");
        Scanner scanner2 = new Scanner(System.in);
        String q = scanner.nextLine();
        subStr(input, q);
    }

    public static int subStr(String input, String q) {
        boolean isExists = input.contains(q);
     if (isExists) {
            System.out.println(input + " contains " + q + " at the index of " + input.indexOf(q));
        } else {
         System.out.println(input.indexOf(q));
     }
        return input.indexOf(q);
    }
}