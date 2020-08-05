public class SuperReducedString {

  public static void main(String[] args) {

    String s = "aaabccddd";
    System.out.println(superReducedString(s));
  }

  private static String superReducedString(String s) {

    if (s.length() < 1) {
      return "Empty String";
    }
    if (s.length() == 1) {
      return s;
    }
    for (int i = 1; i < s.length(); i++) {
      if (s.charAt(i) == s.charAt(i - 1)) {
        s = s.substring(0, i - 1) + s.substring(i + 1);
        i = 0;
      }
    }
    return (s.length() == 0 ? "Empty String" : s);
  }
}
