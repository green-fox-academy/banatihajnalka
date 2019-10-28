import java.util.Arrays;

public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};
        String[] animalsAppendA = appendA(animals);
        System.out.println(Arrays.toString(animalsAppendA));
    }

    private static String[] appendA(String[] animals) {
        int length = animals.length;
        String character = "a";
        String[] animalsAppendA;
        animalsAppendA = new String[length];
        for (int i = 0; i < length; i++) {
            animalsAppendA[i] = animals[i] + character;
        }
        return animalsAppendA;
    }
}
