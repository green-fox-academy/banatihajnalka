package Matrix;

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

        Integer[][] test = {
                {matrix[0][0], matrix[2][1], matrix[1][2], matrix[0][3]},
                {matrix[1][0], matrix[0][1], matrix[2][2], matrix[1][3]},
                {matrix[2][0], matrix[1][1], matrix[0][2], matrix[2][3]}
        };

        System.out.println(Arrays.deepToString(matrix));
        Integer[][] shiftedMatrix = shiftMatrix(matrix);
        System.out.print(Arrays.deepToString(shiftedMatrix));

    }

    private static Integer[][] shiftMatrix(Integer[][] matrix) {
        Integer x = matrix.length;
        Integer y = matrix[0].length;
        Integer[][] shiftedMatrix = new Integer[x][y];
        System.out.println(x);
        System.out.println(y);
        for (int j = 0; j < y; j++) {
            for (int i = 0; i < x; i++) {
                shiftedMatrix[i][j] = matrix[(((i-j) % x) + x) % x][j];
            }
        }
        return shiftedMatrix;
    }
}
