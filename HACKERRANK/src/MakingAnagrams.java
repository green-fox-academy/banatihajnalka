public class MakingAnagrams {

  public static void main(String[] args) {

    String a = "abc";
    String b = "cde";
    System.out.println(makeAnagram(a, b));
  }

  private static int makeAnagram(String a, String b) {

    int[] counter = new int[26];

    for (char c : a.toCharArray()) {
      counter[c - 97]++;
    }
    for (char c : b.toCharArray()) {
      counter[c - 97]--;
    }
    int count = 0;
    for (int i : counter) {
      count += Math.abs(i);
    }
    return count;

  }
}
