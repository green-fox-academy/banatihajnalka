import java.util.Arrays;
import java.util.stream.IntStream;

public class LeftRotation {

  public static void main(String[] args) {
//    int[] array = {33, 47, 70, 37, 8, 53, 13, 93, 71, 72, 51, 100, 60, 87, 97};
    int[] array = {41, 73, 89, 7, 10, 1, 59, 58, 84, 77, 77, 97, 58, 1, 86, 58, 26, 10, 86, 51};
    int d = 13;
    System.out.println(Arrays.toString(rotLeft(array, d)));
    System.out.println(Arrays.toString(rotLeft4(array, d)));

  }

  private static int[] rotLeft(int[] a, int d) {
    int n = a.length;
    int[] rotated = new int[n];

    System.arraycopy(a, d, rotated, 0, n - d);
    System.arraycopy(a, 0, rotated, n - d, d);

    return rotated;
  }

  private static int[] rotLeft2(int[] a, int d) {
    return IntStream.range(0, a.length)
        .map(i -> a[(i + d) % a.length])
        .toArray();
  }

  static int[] rotLeft3(int[] a, int d) {
    int[] b = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      b[i] = a[(i + d) % a.length];
    }
    return b;
  }

  static int[] rotLeft4(int[] a, int d) {
    int l = a.length;
    d = d % l;
    for (int i = 0; i < d; i++) {
      int first = a[0];
      int j;
      for (j = 0; j < l - 1; j++) {
        a[j] = a[j + 1];
      }
      a[j] = first;
    }
    return a;
  }

}
