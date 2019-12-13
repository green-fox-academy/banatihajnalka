import java.util.HashMap;
import java.util.Map;

public class CountLetters {

   public static void printHashMap(HashMap<String, Integer> letterCounts) {
       for (String letter : letterCounts.keySet()) {
           System.out.println(letter);
       }
       for (Integer count : letterCounts.values()) {
           System.out.println(count);
       }
       for (Map.Entry<String, Integer> letterCount : letterCounts.entrySet()) {
           System.out.printf("Letter \"%s\" occurs %d times\n", letterCount.getKey(), letterCount.getValue());
       }
    }

    public static HashMap<String, Integer>  lettersToHashMap (String word) throws Exception {
       if (word == null || word.isEmpty()) {
           throw new Exception("String not exists");
       }
       if (word.length() > 15) {
           throw new Exception("Word is too long");
       }
       String[] appleCharacters = word.split("");
        if (appleCharacters.length == 0) {
            throw new Exception("CharacterArray not exists");
        }
        HashMap<String, Integer> letterCounts = new HashMap<>();

        for (int i = 0; i < appleCharacters.length; i++) {
            String letter = appleCharacters[i];
            if (!letterCounts.containsKey(letter)) {
                letterCounts.put(letter, 1);
            } else {
                letterCounts.replace(letter, letterCounts.get(letter) + 1);
            }
        }
        if (letterCounts.isEmpty() ) {
            throw new Exception("hashMap not exists");
        }
        return letterCounts;
        }
    }
