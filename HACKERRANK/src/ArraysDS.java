import java.util.Arrays;

public class ArraysDS {

  public static void main(String[] args) {
    int[] a = {1, 4, 3, 2};
    System.out.println(Arrays.toString(reverseArray(a)));

  }

  private static int[] reverseArray(int[] a) {
    int[] rev = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      rev[i] = a[a.length - 1 - i];
    }
    return rev;
  }

}
