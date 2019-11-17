import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortDescenAscend {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending
        //  Example:
        //  System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //     should print [5, 9, 12, 24, 34]
        //  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //     should print [34, 24, 12, 9, 5]

        List<Integer> input = Arrays.asList(34, 12, 24, 9, 5);
        System.out.println(input);

        List<Integer> ascList = ascendFunction(input);
        System.out.println(ascList);

        List<Integer> descList = descendFunction(input);
        System.out.println(descList);

    }

    private static List<Integer> ascendFunction(List<Integer> input) {
        List<Integer> ascList = input;
        Collections.sort(ascList);
        return ascList;
    }

    private static List<Integer> descendFunction(List<Integer> input) {
        List<Integer> descList = input;
        Collections.sort(descList);
        Collections.reverse(descList);
        return descList;
    }

    }

 //       boolean isNotInDesc;
  //      for (int i = 0; i < descList.size(); i++) {
 //       if (descList.get(i - 1) >= descList.get(i)) {
//         isNotInDesc = true;