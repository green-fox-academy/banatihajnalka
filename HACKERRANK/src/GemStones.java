public class GemStones {

  public static void main(String[] args) {
    String[] arr = {"abcdde", "baccd", "eeabg"};
    System.out.println(gemstones(arr));
  }
  public static int gemstones(String[] arr) {
    int[] charArray = new int[26];
    for (int i = 0; i < arr.length; i++) {
      String currentString = arr[i];
      for (int j = 0; j < currentString.length(); j++) {
        char c = currentString.charAt(j);
        if (charArray[c - 'a'] == i) {
          charArray[c - 'a']++;
        }
      }
    }
    int gemstones = 0;
    for (int i = 0; i < charArray.length; i++) {
      if (charArray[i] == arr.length) {
        gemstones++;
      }
    }
    return gemstones;
  }
}
