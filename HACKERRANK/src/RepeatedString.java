import java.util.Arrays;

public class RepeatedString {

  public static void main(String[] args) {
    String s = "epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq";
    long n = 549382313570L;
    System.out.println(repeatedString(s, n));

  }

  private static long repeatedString(String s, long n) {
    long counter = 0;
    long sContainsA = s.chars().filter(ch -> ch == 'a').count();
    counter += sContainsA * (n / s.length());
    System.out.println( n % s.length());
    for (int i = 0; i < (n % s.length()); i++) {
      if (s.charAt(i) == 'a') {
        counter++;
      }
    }
    return counter;
  }
}