public class DiagonalMatrix {
    public static void main(String[] args) {

        int[][] matrix = new int[4][4];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (row == col) {
                    matrix[row][col] += 1;
                }
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }

    }
}

