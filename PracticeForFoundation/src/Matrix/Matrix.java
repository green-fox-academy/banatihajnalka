package Matrix;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class Matrix {

    public static void main(String[] args) {

        Integer[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11}};

        Integer[][] output = {
                {0, 9, 6, 3},
                {4, 1, 10, 7},
                {8, 5, 2, 11}};


        System.out.println(Arrays.deepToString(matrix));
        Integer[][] shiftedMatrix = shiftMatrix(matrix);
        System.out.print(Arrays.deepToString(shiftedMatrix));

    }

    private static Integer[][] shiftMatrix(Integer[][] matrix) {
        Integer[][] shiftedMatrix = new Integer[3][4];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0) {
                    shiftedMatrix[i][j] = matrix[i][j];
                } else if (i == 1) {
                    shiftedMatrix[i][j] = matrix[i][j];
                } else {
                    shiftedMatrix[i][j] = matrix[i][j];
                }
            }
        }
        return shiftedMatrix;
    }
}
