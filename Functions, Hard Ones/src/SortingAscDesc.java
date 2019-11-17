import javax.sound.midi.Soundbank;
import java.util.*;

public class SortingAscDesc {
    public static void main(String[] args) {
        //  Create a function that takes a list of numbers as parameter
        //  Returns a list where the elements are sorted in ascending numerical order
        //  Make a second boolean parameter, if it's `true` sort that list descending
        //  Example:
        // System.out.println(bubble(new int[] {34, 12, 24, 9, 5}));
        //  should print [5, 9, 12, 24, 34]
        //  System.out.println(advancedBubble(new int[] {34, 12, 24, 9, 5}, true));
        //  should print [34, 24, 12, 9, 5]

        //      System.out.println("Give me some numbers: ");
        //       Scanner scanner = new Scanner(System.in);
        //      int input = scanner.nextInt();

        List<Integer> input = Arrays.asList(34, 12, 24, 9, 5);
        ArrayList<Integer> inputArray = new ArrayList<>();
        inputArray.addAll(input);
        System.out.println(inputArray);

        //    ArrayList<Integer> sorted = ascendingFunction(input[]);

    }
    }

   /*   private static ArrayList<Integer> ascendingFunction(Object[] toArray) {
        ArrayList<Integer> toSort  = new ArrayList<Integer>();
        List<Integer> toSort = Arrays.asList(toArray);
        Collections.sort(toSort);
    }

}
}

  private static ArrayList<Integer> ascendingFunction(int input) {
        ArrayList<Integer> toSort  = new ArrayList<Integer>();
        List<Integer> toSort = Arrays.asList(input);
        Collections.sort(toSort);
      return toSort;

    }
} */