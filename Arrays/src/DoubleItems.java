import java.util.Arrays;

public class DoubleItems {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};
        int[] numList2 = doubledArray(numList);
        System.out.println(Arrays.toString(numList2));
    }
    private static int[] doubledArray(int[] numList) {
        int length = numList.length;
        int[] output;
        output = new int[length];
        for (int i = 0; i < numList.length; i++) {
            output[i] = numList[i] * 2;
        }
        return output;
    }
}
