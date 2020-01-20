package Concatenate;

public class Concatenate {

    public static String concatenate(String first, String second) {
        StringBuilder concatenated = new StringBuilder();
        for (int i = 0; i < first.length() || i < second.length(); i++) {
            if (i < first.length())
                concatenated.append(first.charAt(i));
            if (i < second.length())
                concatenated.append(second.charAt(i));
        }
        return concatenated.toString();
    }

    public static String concatenateSecondVersion(String first, String second) {
        StringBuilder concatenated = new StringBuilder();
        if (first.length() == second.length()) {
            for (int i = 0; i < first.length(); i++) {
                concatenated.append(first.charAt(i));
                concatenated.append(second.charAt(i));
            }
        } else if (first.length() <= second.length()) {
            for (int i = 0; i < first.length(); i++) {
                concatenated.append(first.charAt(i));
                concatenated.append(second.charAt(i));
            }
            for (int j = first.length(); j < second.length(); j++) {
                concatenated.append(second.charAt(j));
            }
        } else {
            for (int i = 0; i < second.length(); i++) {
                concatenated.append(first.charAt(i));
                concatenated.append(second.charAt(i));
            }
            for (int j = second.length(); j < first.length(); j++) {
                concatenated.append(first.charAt(j));
            }
        }
        return concatenated.toString();
    }
}
