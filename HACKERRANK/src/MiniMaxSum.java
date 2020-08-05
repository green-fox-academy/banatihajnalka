import java.util.Arrays;

public class MiniMaxSum {

  public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};
    miniMaxSum(arr);
  }

  private static void miniMaxSum(int[] arr) {
    long mini = 0;
    long med = 0;
    long max = 0;
    Arrays.sort(arr);
    for (int i = 1; i < arr.length - 1; i++) {
      med += arr[i];
    }
    mini += arr[0] + med;
    max += med + arr[arr.length - 1];
    System.out.println(mini + " " + max);

  }
  }


