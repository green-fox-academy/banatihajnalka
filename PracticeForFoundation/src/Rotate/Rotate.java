package Rotate;

public class Rotate {

    public static Integer[][] rotate(Integer[][] toRotate) {
        int lenght = toRotate.length;
        Integer[][] rotatedMatrix = new Integer[lenght][lenght];
        for (int i = 0; i<toRotate.length; i++){
            for (int j = 0; j<toRotate[i].length; j++){
                rotatedMatrix[i][j] = toRotate[lenght -1 - j][i];
            }
        }
        return rotatedMatrix;
    }

    public static void printRotatedMatrix(Integer[][] rotatedMatrix) {
        for (int i = 0; i < rotatedMatrix.length; i++) {
            for (int j = 0; j < rotatedMatrix[0].length; j++) {
                System.out.print(rotatedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
