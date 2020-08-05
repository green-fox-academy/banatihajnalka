import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JavaSubstringComparisons {

  public static void main(String[] args) {

    String s = "welcometojava";
    int k = 3;
    System.out.println(getSmallestAndLargest(s,k));

  }
  private static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    List<String> substrings = new ArrayList<>();
    for (int i = 0; i < s.length() - 3 ; i++) {
      String currentString = s.substring(i, i + 3);
      substrings.add(currentString);
      substrings.add(s.substring(s.length() - 3, s.length()));
    }
    Collections.sort(substrings);
    smallest = substrings.get(0);
    largest = substrings.get(substrings.size() - 1);
    return smallest + "\n" + largest;
  }
}
