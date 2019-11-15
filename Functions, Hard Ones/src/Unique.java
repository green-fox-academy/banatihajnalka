import java.util.HashMap;

public class Unique {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as a parameter
        //  Returns a list of numbers where every number in the list occurs only once
        //  Example
        //  System.out.println(unique(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
        //  should print: `[1, 11, 34, 52, 61]`

        int intArray[] = {1, 11, 34, 11, 52, 61, 1, 34};

        HashMap<Integer, Integer> findUnique = new HashMap<Integer, Integer>(intArray.length);
        for (int i = 0; i < intArray.length; i++) {
            findUnique.put(intArray[i], i);
        }
        System.out.println(findUnique.keySet());
    }
}
