import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] reverse = reverseAll(aj);
        System.out.println(Arrays.toString(reverse));
    }

    private static int[] reverseAll(int[] aj) {
        int length = aj.length;
        int[] reverse;
        reverse = new int[length];
        for (int i = 0; i < aj.length; i++) {
           reverse[length-1-i] = aj[i];
        }
        return reverse;
    }


}
