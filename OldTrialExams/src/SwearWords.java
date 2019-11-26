//Write a method which can read and parse a file containing not so family friendly text.
//The method must remove all the given words from the file;
//and return the amount of the removed words.

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {
    public static void main(String[] args) {

//        String[] wordsToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
//        List<String> wordsList = new ArrayList<String>(Arrays.asList(wordsToRemove));
        //       System.out.println(Arrays.toString(wordsToRemove));
        //      System.out.println(wordsList);

        removeWords("SwearWords.txt");
    }

    private static void removeWords(String from) {

        List<String> text = new ArrayList<>();

        try {
            text = Files.readAllLines(Paths.get(from));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        System.out.println(text);
//
//        String[] wordsToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
//        List<String> wordsToRemoveList = new ArrayList<String>(Arrays.asList(wordsToRemove));
////        text.removeAll(wordsList);
//        System.out.println(text);



 //    List<String> wordsList = Arrays.asList("fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt");
 //       System.out.println(wordsList);

//        int original = text.size();
//
//        text.removeAll(wordsList);
//        System.out.println("after removeAll " + text);
//
//        int afterRemoval = text.size();
//        int removedWords = original - afterRemoval;
//        System.out.println(removedWords);
//
//        int countRemoved = 0;
//
////       String[] wordsToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
//
//        for (int i = 0; i < wordsToRemoveList.size(); i++) {
//        //    text.get(i).split(" ");
//           for (int j = 0; j < text.size(); j++) {
//                if (wordsToRemoveList.get(i).equals(text(j)))) {
//                    text.remove(i);
//                    countRemoved++;
//                }
//            } System.out.println(countRemoved);
//
        }

    }
//



//        String allText = "";
//        for (int i = 0; i < text.size() ; i++) {
//            allText += text.get(i);
//        }
//        System.out.println(allText);

//        String[] fromArray = text.toArray(new String[text.size()]);
//        System.out.println(Arrays.toString(fromArray));





