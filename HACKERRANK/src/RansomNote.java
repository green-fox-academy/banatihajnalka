import java.util.HashMap;
import java.util.Map;

public class RansomNote {

  public static void main(String[] args) {
    String magazine = "o l x imjaw bee khmla v o v o imjaw l khmla imjaw x";
    String[] magazineArr = magazine.split(" ");
    String note = "imjaw l khmla x imjaw o l l o khmla v bee o o imjaw imjaw o";
    String[] noteArr = note.split(" ");
    checkMagazine(magazineArr, noteArr);

  }

  private static void checkMagazine(String[] magazine, String[] note) {

    if (note.length > magazine.length) {
      System.out.println("No");
      return;
    }

    Map<String, Integer> magazineHash = new HashMap<>();
    magazineHash = arrayToHashMap(magazine);
    Map<String, Integer> noteHash = new HashMap<>();
    noteHash = arrayToHashMap(note);

    System.out.println((canBeReplaced(magazineHash, noteHash) ? "Yes" : "No" ));
  }

  private static HashMap<String, Integer> arrayToHashMap(String[] array) {
    HashMap<String, Integer> hashMap = new HashMap<>();
    for (String string : array) {
      if (hashMap.containsKey(string)) {
        hashMap.put(string, hashMap.get(string) + 1);
      } else {
        hashMap.put(string, 1);
      }
    }
    return hashMap;
  }

  private static boolean canBeReplaced(Map<String, Integer> magazineHash, Map<String, Integer> noteHash) {
    boolean canBeReplaced = true;
    for (String string : noteHash.keySet()) {
      if (!magazineHash.containsKey(string) || magazineHash.get(string) < noteHash.get(string)) {
        canBeReplaced = false;
      }
    }
    return canBeReplaced;
  }
}

