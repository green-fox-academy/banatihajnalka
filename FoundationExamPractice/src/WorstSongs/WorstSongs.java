package WorstSongs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class WorstSongs {

    static List<String> readFile(String fileName) {
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(fileName));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }

    static List<String> splitSongs (List<String> text) {
        List<String> splittedList = new ArrayList<>();
        for (int i = 0; i < text.size() ; i++) {
            String[] row = text.get(i).split(";");
            splittedList.add(row[row.length - 1]);
        } return splittedList;
    }

    static Map<String, Integer> yearsToHashMap (List<String> text) {
        Map<String, Integer> yearsCount = new HashMap<>();
        for (String string : text) {
            if (yearsCount.containsKey(string)) {
                yearsCount.put(string, yearsCount.get(string) + 1);
            } else {
                yearsCount.put(string, 1);
                }
        } return yearsCount;
    }

    static String findMaxValue (Map<String, Integer> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}
