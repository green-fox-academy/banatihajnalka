package TextFromMatrix;

public class TextFromMatrixOddAndEven {


    public static String textFromMatrixOddAndEven(String[][] matrixArray) {
        String stringFromMatrix = "";
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                if (i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1)
                stringFromMatrix += matrixArray[i][j];
            }
        }   return stringFromMatrix;
    }
}
