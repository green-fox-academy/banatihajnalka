public class CountSwaps {

  public static void main(String[] args) {
    int[] a = {3, 2, 1};
    countSwaps(a);
  }

  private static void countSwaps(int[] a) {

    int count = 0;
    for (int i = 0; i < a.length - 1; i++) {
      while (a[i] > a[i + 1]) {
        int temp = a[i];
        a[i] = a[i + 1];
        a[i + 1] = temp;
        count++;
        i = 0;
      }
    }
    System.out.println("Array is sorted in " + count + " swaps.");
    System.out.println("First Element: " + a[0]);
    System.out.println("Last Element: " + a[a.length - 1]);


  }
}
