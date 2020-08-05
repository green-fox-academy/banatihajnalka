import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EqualizeArray {

  public static void main(String[] args) {

    int[] arr = {3, 3, 2, 1, 3};
    System.out.println(equalizeArray(arr));
  }

  private static int equalizeArray(int[] arr) {
    HashMap<Integer, Integer> hm = new HashMap<>();
    for (Integer number : arr) {
      if (hm.containsKey(number)) {
        hm.put(number, hm.get(number) + 1);
      } else {
        hm.put(number, 1);
      }
    }
    int max = Collections.max(hm.values());
    return arr.length - max;

  }
}

