import javax.swing.*;
import java.util.Arrays;
import java.util.Random;

public class IsSymmetricArrayRandom {
    public static void main(String[] args) {

    // Create a random array[][]
        Random random = new Random();
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        for (int[] a : array) {
            System.out.println(Arrays.toString(a));
        }

        boolean isSymmetric = isSymmetric(array);
        if (isSymmetric) {
            System.out.println("Your array is symmetric");
        } else {
            System.out.println("Your array is not symmetric");
        }

    }

    private static boolean isSymmetric(int[][] array) {
        int size = array.length;
        //last row
        int lastRow[] = new int[size];
        for (int i=0; i<size; i++) {
            lastRow[i] = array[size-1][i];
        }
        System.out.println("lastRow= " + Arrays.toString(lastRow));

        // diagonal
        int diagonal[] = new int[size];
        for (int i=0; i<size; i++) {
            diagonal[i] = array[i][i];
        }
        System.out.println("diagonal= " + Arrays.toString(diagonal));

        // check if equals
        return Arrays.equals(diagonal,lastRow);
        /*
        for (int i=0; i<size; i++) {
            if (diagonal[i] != lastRow[i]) {
                return false;
            }
        }
        return true;
        */
    }
}