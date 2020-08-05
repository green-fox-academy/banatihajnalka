import java.util.Arrays;

public class JavaAnagrams {

  public static void main(String[] args) {
    String a = "anagram";
    String b = "margana";
    System.out.println(isAnagram(a, b) ? "Anagrams" : "Not Anagrams");
  }

  private static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    }
    char[] charA = a.toLowerCase().toCharArray();
    char[] charB = b.toLowerCase().toCharArray();
    Arrays.sort(charA);
    Arrays.sort(charB);
    return Arrays.equals(charA, charB);
  }

  private static boolean isAnagram2(String a, String b) {
    if (a.length() != b.length()) return false;
    int[] c = new int[26];
    int[] d = new int[26];
    a = a.toUpperCase();
    b = b.toUpperCase();
    for (int i = 0; i < a.length(); i++) {
      c[a.charAt(i) - 'A']++;
      d[b.charAt(i) - 'A']++;
    }
    for (int i = 0; i < 26; i++)
      if (c[i] != d[i]) return false;
    return true;
  }
}
