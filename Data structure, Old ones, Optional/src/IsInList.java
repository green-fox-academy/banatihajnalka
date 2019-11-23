// Check if list contains all of the following elements: 4,8,12,16
// Create a method that accepts list as an input
// it should return "true" if it contains all, otherwise "false"

import java.util.ArrayList;
import java.util.Arrays;

public class IsInList {
    public static void main(String... args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16));

        checkNums(list);
    }

    private static boolean checkNums(ArrayList<Integer> list) {
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 8, 13, 16));
        boolean result = false;
        for (int i = 0; i < list2.size(); i++) {
            result = list.contains(list2.get(i));
            if (!result) {
                System.out.println("False");
                break;
            }
        }
        System.out.println("True");
        return result;
    }
}
