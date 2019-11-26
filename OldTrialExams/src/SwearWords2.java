import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords2 {
    public static void main(String[] args) {
        removeWords("SwearWords.txt");
    }

    private static void removeWords(String from) {

        List<String> textList = new ArrayList<>();

        try {
            textList = Files.readAllLines(Paths.get(from));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
//        System.out.println(text);
//        String[] textArray = text.toArray(new String[0])[0].split(" "); // why omitting the 2nd half of the 1-itemed list we read before?
//        System.out.println("textArray" + Arrays.toString(textArray));
//
//        List<String> textList = Arrays.asList(textArray);
//        System.out.println("textList" + textList);
//
        String[] wordsToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        List<String> wordList = new ArrayList<String>(Arrays.asList(wordsToRemove));

// forditott loop
// split
// ures listaba vissza, ami nem csunya
        
        int countRemoved = 0;
        for (int i = 0; i < wordList.size(); i++) {
            String wordTeRemove = wordList.get(i).toString().replace(".","").replace(",","").replace(" ","").toLowerCase();
            for (int j = 0; j < textList.size(); j++) {
                String wordTested = textList.get(j).replace(".","").replace(",","").replace(" ","").toLowerCase();
                System.out.println("\n[" + wordTeRemove + "] - [" + wordTested + "]");
                if (wordTested.equals(wordTeRemove)) {
                    textList.remove(wordTeRemove); // Why not possible to remove "bloody" while it was possible for "fuck"?????
                    countRemoved++;
                    System.out.println("FOUND");
                } else {
                    System.out.println("not found");
                }
            }
        }
        System.out.println(countRemoved);

//        int countRemoved = 0;
//
//        for (int i = 0; i < text.size(); i++) {
//            String[] textArray = text.get(i).split(" ");
//            List<String> line = new ArrayList<>(Arrays.asList(textArray));
//            for (String lineElement : wordList) {
//                if (wordList.contains(lineElement)) {
//                    text.remove(lineElement);
//                    countRemoved++;
//                }
//            }
//            text.set(i, String.join(" ",text));
//        }
//        for (String string : text) {
//            System.out.println(string + countRemoved);

    }


}
