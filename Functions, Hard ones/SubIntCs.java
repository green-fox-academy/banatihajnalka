import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class SubIntCs {
    public static void main(String[] args) {
        int[] intArray = {1, 11, 34, 52, 61};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give me a number: ");
        int number = scanner.nextInt();
        String numberString = Integer.toString(number);

        String strArray[] = new String[intArray.length];
        for (int i = 0; i < intArray.length; i++)
            strArray[i] = String.valueOf(intArray[i]);

        Collection<String> contains = new ArrayList<String>();
        //int containsNull[] = new int[intArray.length];
        //int currentIndex = 0;
        for (int i = 0; i < intArray.length; i++) {
            if (strArray[i].indexOf(numberString) > -1) {
                //containsNull[currentIndex] = i;
                //currentIndex++;
                contains.add(Integer.toString(i));
            }
        }
        //System.out.println(Arrays.toString(containsNull));
        System.out.println(contains);

/*        int contains[] = new int[currentIndex];
        for (int i = 0; i < currentIndex; i++) {
            contains[i] = containsNull[i];
        }
        System.out.println(Arrays.toString(contains));
*/
    }

        //  private static boolean contains(int[] intArray, int number) {
  /*      boolean result = false;
        for (int i : intArray) {
            for (int i = 0; i < intArray.length)
        }

    }
*/

}