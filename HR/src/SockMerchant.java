import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SockMerchant {

    public static void main(String[] args) {

        int numberOfSocks = 9;
//        int[] colorsOfSocks = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] colorsOfSocks = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};

        HashMap<Integer, Integer> countColors = new HashMap<Integer, Integer>();
        for (Integer color : colorsOfSocks) {
            if (countColors.containsKey(color)) {
                countColors.put(color, countColors.get(color) + 1);
            } else {
                countColors.put(color, 1);
            }
        }

        for (Map.Entry entry : countColors.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        List<Integer> optionalPairs = countColors.values().stream()
                .filter(integer -> integer >= 2)
                .collect(Collectors.toList());

        System.out.println(optionalPairs);

        int counter = 0;
        for (Integer pair : optionalPairs) {
            counter+= pair/2;
        }

        System.out.println(counter);

    }
}
