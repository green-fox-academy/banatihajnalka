import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoStrings {

  public static void main(String[] args) {

    String s1 = "hiw";
    String s2 = "world";

    System.out.println(twoStrings(s1, s2));
    System.out.println(twoStrings2(s1, s2));
  }

  private static String twoStrings(String s1, String s2) {

//    String longest = (s2.length() < s1.length()) ? s1 : s2;
    char[] s1Arr = s2.toCharArray();
    for (char c : s1Arr) {
      if (s1.contains(String.valueOf(c))) {
        return "YES";
      }
    }
    return "NO";
  }

  private static String twoStrings2(String s1, String s2) {

//    List<Character> characterS1List = s1.chars().mapToObj(e ->(char)e).collect(Collectors.toList());
//    List<Character> characterS2List = s2.chars().mapToObj(e ->(char)e).collect(Collectors.toList());

    List<Character> charS1List = new ArrayList<>();
    List<Character> charS2List = new ArrayList<>();
    for (char c: s1.toCharArray()) {
      charS1List.add(c);
    }
    for (char c: s2.toCharArray()) {
      charS2List.add(c);
    }
    Set<Character> charS1Set = new HashSet<Character>(charS1List);
    Set<Character> charS2Set = new HashSet<Character>(charS2List);

    charS1Set.retainAll(charS2Set);

    if (charS1Set.isEmpty()) {
      return "NO";
    }
    return "YES";
  }
}


