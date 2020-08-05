import java.util.Arrays;

public class CircularArrayRotation {

  public static void main(String[] args) {
    int[] a = {1, 2, 3};
    int[] queries = {0, 1, 2};
    int k = 2;
    System.out.println(Arrays.toString(circularArrayRotation(a, k, queries)));
    System.out.println(Arrays.toString(circularArrayRotation2(a, k, queries)));
//    System.out.println(Arrays.toString(circularArrayRotation3(a, k, queries)));
  }

  private static int[] circularArrayRotation(int[] a, int k, int[] queries) {
    int[] rotated = new int[a.length];
    for (int i = 0; i < a.length; i++) {
      rotated[i] = a[(queries[i] - k + a.length) % a.length];
    }
    return rotated;
  }

  private static int[] circularArrayRotation2(int[] a, int k, int[] queries) {
    k = k % a.length;
    int last;
    for (int i = 0; i < k; i++) {
      last = a[a.length - 1];
      for (int j = a.length - 1; j > 0; j--) {
        a[j] = a[j - 1];
      }
      a[0] = last;
    }
    int[] result = new int[queries.length];
    for (int i = 0; i < queries.length; i++) {
      result[i] = a[queries[i]];
    }
    return result;
  }
}

//  private static int[] circularArrayRotation3(int[] a, int k, int[] queries) {
//    int d = k % a.length;
//    System.arraycopy(a, 0, a, k, a.length - k);
////    System.arraycopy(a, a.length-k, a, 0, k);
//    return a;
//  }

