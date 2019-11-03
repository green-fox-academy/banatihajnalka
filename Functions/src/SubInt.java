import java.util.Arrays;
import java.util.Scanner;

public class SubInt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);
        System.out.println(numberString);

        int[] intArray = {1, 11, 34, 52, 61};
        String strArray[] = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++)
            strArray[i] = String.valueOf(intArray[i]);

        String valueToSearch = numberString;

        boolean isExist = false;
        for (int i = 0; i < intArray.length; i++) {
            String arrayValue = strArray[i];
            if (valueToSearch.equals(arrayValue)) {
                isExist = true;
                break;
            }
        }
        if (isExist) {
            System.out.println("String found");
        } else {
            System.out.println(" ");
        }

    }
}
