
//    Write a function that takes a filename as a parameter. Return the 2 most common characters and their occurrences in the file's content.
//    If the file does not exist throw an exception with the following message: "File does not exist!"

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MostCommonCharacters {
    public static void main(String[] args) {

        findMostCommonChar("MostCommonChar.txt");
    }

    public static void findMostCommonChar(String filename) {

        List<String> text = new ArrayList<>();

        try {
            text = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("File does not exist!");
        }

        String allText = "";

        for (int i = 0; i < text.size(); i++) {
            allText += text.get(i);
        }

        char[] charArray = allText.toCharArray();
        HashMap<Character, Integer> countMap = new HashMap<>();

        for (char c : charArray) {
            if (countMap.containsKey(c)) {
                countMap.put(c, countMap.get(c) + 1);
            } else {
                countMap.put(c, 1);
            }
        }
        int value = 0;
        char key = '\0';
        HashMap<Character, Integer> twoMostCommonCharMap = new HashMap<>();

        for (int i = 0; i < 2; i++) {
            for (Map.Entry<Character, Integer> charCounters : countMap.entrySet()) {
                if (charCounters.getValue() == Collections.max(countMap.values())) {
                    value = charCounters.getValue();
                    key = charCounters.getKey();
                }
            }
            countMap.remove(key);
            twoMostCommonCharMap.put(key, value);
        }
        for (Map.Entry<Character, Integer> charCounters : twoMostCommonCharMap.entrySet()) {
            System.out.printf("\"%s\" : %d\n", charCounters.getKey(), charCounters.getValue());
        }
    }
}