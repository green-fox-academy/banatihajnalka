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
        String[] wordsToRemove = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};
        List<String> removeFrom = readFile();
        List<String> splittedRemoveFrom = split(removeFrom);
        System.out.println(remove(splittedRemoveFrom, wordsToRemove));
    }

    public static List<String> split(List<String> removeFrom) {
        List<String> splittedRemovefrom = new ArrayList<>();
        for (String string : removeFrom) {
            splittedRemovefrom.addAll(Arrays.asList(string.toLowerCase().replace(".", "").replace(",", "").split(" ")));
        }
        return splittedRemovefrom;
        }

        public static int remove (List < String > splittedRemoveFrom, String[]wordsToRemove){
            int countRemoved = 0;
            for (int i = 0; i < splittedRemoveFrom.size(); i++) {
                for (int j = 0; j < wordsToRemove.length; j++) {
                    if (splittedRemoveFrom.get(i).equals(wordsToRemove[j])) {
                        splittedRemoveFrom.remove(i);
                        countRemoved++;
                    }
                }
            }
            return countRemoved;
        }

        private static List<String> readFile () {
            List<String> text = new ArrayList<>();
            try {
                text = Files.readAllLines(Paths.get("SwearWords.txt"));
            } catch (IOException e) {
                System.out.println("File does not exists");
            }
            return text;
        }
    }






