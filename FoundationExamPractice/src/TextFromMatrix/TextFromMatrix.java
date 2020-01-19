package TextFromMatrix;

public class TextFromMatrix {

    public static String textFromMatrix(String[][] matrixArray) throws MyOwnExceptions {
        String stringFromMatrix = "";
        if (matrixArray == null || matrixArray.length == 0) {
            throw new MyOwnExceptions("Matrix is empty");
        }
        if (matrixArray[1].length < 2) {
            throw new MyOwnExceptions("Not a 2D matrix");
        }
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                stringFromMatrix += matrixArray[j][i];
            }
        }   return stringFromMatrix;
    }
}
