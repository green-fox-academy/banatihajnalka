import java.text.DecimalFormat;

public class PlusMinus {

  public static void main(String[] args) {

    int[] arr = {-4, 3, -9, 0, 4, 1};
    plusMinus(arr);
  }

  static void plusMinus(int[] arr) {
    DecimalFormat df = new DecimalFormat("#,###,##0.000000");
    double length = arr.length;
    double minus = 0;
    double plus = 0;
    double zero = 0;
    for (int number : arr) {
      if (number > 0) {
        plus++;
      } else if (number < 0) {
        minus++;
      } else {
        zero++;
      }
    }
    double minusRatio =  (minus / length);
    double plusRatio =  (plus / length);
    double zeroRatio = (zero / length);
    System.out.println(df.format(plusRatio));
    System.out.println(df.format(minusRatio));
    System.out.println(df.format(zeroRatio));

  }

}
