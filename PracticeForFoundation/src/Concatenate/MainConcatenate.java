package Concatenate;

import static Concatenate.Concatenate.concatenate;
import static Concatenate.Concatenate.concatenateSecondVersion;

public class MainConcatenate {

    public static void main(String[] args) {
        String first = "alma";
        String second = "traktor";

        String concatenated = concatenate(first, second);
        System.out.println(concatenated);

        String concatenatedSecondVerion = concatenateSecondVersion(first, second);
        System.out.println(concatenatedSecondVerion);
    }
}
