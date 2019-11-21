import java.util.*;

// Create a method called "appendA()" that adds "a" to every string in the "far" list.
// The parameter should be a list.
// The output should be: "boa", "anaconda", "koala", "panda", "zebra"
public class AppendLetter {
    public static void main(String[] args) {

        List<String> far = Arrays.asList("bo", "anacond", "koal", "pand", "zebr");

        System.out.println(appendA(far));

    }

    private static String appendA(List<String> far) {
        String character = "a";
        String[] farArray = far.toArray(new String[0]);
        for (int i = 0; i < far.size(); i++) {
            farArray[i] = farArray[i].toString() + character;
        } return Arrays.toString(farArray);
    }
}