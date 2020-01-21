package Rotate;

import java.util.Arrays;

import static Rotate.Rotate.printRotatedMatrix;
import static Rotate.Rotate.rotate;

public class MainRotate {

    public static void main(String[] args) {

        Integer[][] integers = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};


        Integer[][] rotatedMatrix = rotate(integers);

       printRotatedMatrix(rotate(integers));
    }
}
