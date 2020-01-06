package WordReverse;

import java.util.ArrayList;
import java.util.List;

public class WordReverse {

        public String reverse (String sentenceToReserve){
            String[] splittedSentence = sentenceToReserve.split(" ");
            List<String> reversedList = new ArrayList<>();
            for (int i = 0; i < splittedSentence.length; i++) {
                StringBuilder currentWords = new StringBuilder(splittedSentence[i]);
                String currentReverse = "";
                for (int j = currentWords.length() - 1; j >= 0; j--) {
                    currentReverse += currentWords.charAt(j);
                }
                reversedList.add(currentReverse);
            }
            return String.join(" ", reversedList);
        }
    }
