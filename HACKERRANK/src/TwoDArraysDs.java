public class twoDArraysDs {

  public static void main(String[] args) {

    int[][] arr = {
        {1, 1, 1, 0, 0, 0},
        {0, 1, 0, 0, 0, 0},
        {1, 1, 1, 0, 0, 0},
        {0, 0, 2, 4, 4, 0},
        {0, 0, 0, 2, 0, 0},
        {0, 0, 1, 2, 4, 0}};

    System.out.println(hourglassSum(arr));
  }

  private static int hourglassSum(int[][] arr) {
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < arr.length - 2; i++) {
      for (int j = 0; j < arr[i].length - 2; j++) {
        int hourglass = calculateHourglass(arr, i, j);
        max = Math.max(hourglass, max);
      }
    }
    return max;
  }

  private static int calculateHourglass(int[][] arr, int rowIndex, int columnIndex) {
    int hourglass = 0;
    for (int i = 0; i <= 2; i += 2) {
      for (int j = 0; j <= 2; j++) {
        hourglass += arr[rowIndex + i][columnIndex + j];
      }
    }
    return hourglass + arr[rowIndex + 1][columnIndex + 1];
  }
}
