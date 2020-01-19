package TextFromMatrix;

public class MainTextFromMatrix {
    public static void main(String[] args) {

        String[][] firstArray = {{"n", "x"}, {"m", "o"}};
        String[][] secondArray = {{"h", "p", "e"}, {"k", "l", "a"}, {"l", "m", "o"}};

        String textFromMatrix = TextFromMatrix.textFromMatrix(firstArray);
        String textFromMatrix2 = TextFromMatrix.textFromMatrix(secondArray);

        System.out.println(textFromMatrix);
        System.out.println(textFromMatrix2);

        String textOddAndEven = TextFromMatrixOddAndEven.textFromMatrixOddAndEven(firstArray);
        String textOddAndEven2 = TextFromMatrixOddAndEven.textFromMatrixOddAndEven(secondArray);

        System.out.println(textOddAndEven);
        System.out.println(textOddAndEven2);
    }
}
