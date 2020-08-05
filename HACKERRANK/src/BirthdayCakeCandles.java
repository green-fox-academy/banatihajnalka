import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BirthdayCakeCandles {

  public static void main(String[] args) {
    int[] ar = {3, 2, 1, 3};
    System.out.println(birthdayCakeCandles(ar));
  }

  private static int birthdayCakeCandles(int[] ar) {

    HashMap<Integer, Integer> countCandles = new HashMap<Integer, Integer>();
    for (Integer height : ar) {
      if (countCandles.containsKey(height)) {
        countCandles.put(height, countCandles.get(height) + 1);
      } else {
        countCandles.put(height, 1);
      }
    }
    Integer max = Collections.max(countCandles.keySet());
    Integer count = 0;

    for (Map.Entry entry : countCandles.entrySet()) {
      if (entry.getKey().equals(max)) {
        count = (Integer) entry.getValue();
      }
    }
    return count;
  }
}
