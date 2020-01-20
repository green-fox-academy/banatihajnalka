package WordReverser;

import java.util.ArrayList;
import java.util.List;

public class WordReverser {

    public static String wordReverser (String sentence) throws StringDoesNotExists {
        if (sentence == "" || sentence == null) {
            throw new StringDoesNotExists();
        }
        String[] splittedSentence = sentence.split(" ");
        List<String> reversedSentence = new ArrayList<>();
        for (int i = 0; i < splittedSentence.length; i++) {
            StringBuilder currentWord = new StringBuilder(splittedSentence[i]);
            String currentReversed = "";
            for (int j = currentWord.length() - 1; j >= 0; j--) {
                currentReversed += currentWord.charAt(j);
            }
            reversedSentence.add(currentReversed);
        } return String.join(" ", reversedSentence);
    }
}