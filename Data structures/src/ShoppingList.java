import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {
    public static void main(String[] args) {
        //Create a list
        ArrayList<String> sL = new ArrayList<>(Arrays.asList("Eggs", "milk", "fish", "apples", "bread", "chicken"));

        System.out.println(sL);

        Scanner Scanner = new Scanner(System.in);
        System.out.println("Searching for: ");
        String search = Scanner.nextLine();
        if (sL.contains(search)) {
            System.out.println("Yes, we have "+ search + ".");
        } else {
            System.out.println("No, we don't have it.");
        }
    }
}

   //    String doWeHave = "";
   //     if (sL.contains("milk")) {
   //         System.out.println("Yes, we have.");
   //     } else {
   //       System.out.println("No, we do not have.");

