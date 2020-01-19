package TextFromMatrix;

public class TextFromMatrix {

    public static String textFromMatrix(String[][] matrixArray) {
        String stringFromMatrix = "";
        for (int i = 0; i < matrixArray.length; i++) {
            for (int j = 0; j < matrixArray[i].length; j++) {
                stringFromMatrix += matrixArray[j][i];
            }
        }   return stringFromMatrix;
    }
}
