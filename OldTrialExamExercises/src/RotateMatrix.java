//Create a function named rotateMatrix that takes an n×n integer matrix (array of arrays) as parameter,
// and returns a matrix which elements are rotated 90 degrees clockwise.

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class RotateMatrix {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(5);
            }
        }
        for (int[] a : array) {
            System.out.println("Original " + Arrays.toString(a));
        }
        rotateMatrix(array);

        for (int[] b : rotateMatrix(array)) {
            System.out.println("Rotated " + Arrays.toString(b));
        }
        printRotatedMatrix(rotateMatrix(array));
    }

    private static void printRotatedMatrix(int[][] rotateMatrix) {
        for (int i = 0; i < rotateMatrix.length; i++) {
            for (int j = 0; j < rotateMatrix[0].length; j++) {
                System.out.print(rotateMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static int[][] rotateMatrix(int[][] array) {
            int length = array.length;
            int rotated[][] = new int[length][length];

            for (int i = 0; i < length; ++i) {
                for (int j = 0; j < length ; ++j) {
                    rotated[i][j] = array[length - j - 1][i];
                    rotated[i][j] = array[j][length - i - 1];
                }
            } return rotated;
        }
}
