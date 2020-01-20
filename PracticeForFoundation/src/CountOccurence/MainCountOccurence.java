package CountOccurence;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

import static CountOccurence.CountOccurence.findOccurence;

public class MainCountOccurence {
    public static void main(String[] args) {

        Integer[] array = {3, 5, 6, 3, 1, 1, 5};
        System.out.println(Arrays.toString(array));

        HashMap<Integer, Integer> occurenceOfNumbers = findOccurence(array);

        System.out.println(Arrays.asList(occurenceOfNumbers));
        System.out.println(Collections.singletonList(occurenceOfNumbers));
    }
}
