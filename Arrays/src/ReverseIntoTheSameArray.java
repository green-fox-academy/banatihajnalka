import java.util.Arrays;

public class ReverseIntoTheSameArray {
    public static void main(String[] args) {
        int[] aj = {3, 4, 5, 6, 7};
        int[] ajReverse = new int[aj.length];

        for (int i = 0; i < aj.length; i++) {
            ajReverse[i] = aj[aj.length - 1 - i];
        }

        for (int i = 0; i < aj.length; i++) {
            aj[i] = ajReverse[i];
        }
        System.out.println(Arrays.toString(aj));
    }
}
