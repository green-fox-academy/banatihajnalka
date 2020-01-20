package CountOccurence;

import java.util.HashMap;

public class CountOccurence {

    public static HashMap<Integer, Integer> findOccurence(Integer[] array) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
        for (Integer number : array) {
            if (!numbers.containsKey(number)) {
                numbers.put(number, 1);
            } else {
                numbers.put(number, numbers.get(number) + 1);
            }
        }
        return numbers;
    }
}
