package WorstSongs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class WorstSongs {

    static Character findMostCommonCharacter (String FILE_NAME) {
        List<String> text = readFile(FILE_NAME);
        char[] characterArray = charactersFromList(text);
        HashMap<Character, Integer> characterCount = charactersToHashMap(characterArray);
        return findMostCommon(characterCount);
    }

    static List<String> readFile(String FILE_NAME) {

        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(FILE_NAME));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }

    static char[] charactersFromList(List<String> text) {
        String allText = "";
        for (int i = 0; i < text.size(); i++) {
            allText += text.get(i).toLowerCase().replaceAll("[^a-zA-Z]", "").replaceAll("\\s+","");
        }
        return allText.toCharArray();
    }

    static HashMap<Character, Integer> charactersToHashMap (char[] characters) {
        HashMap<Character, Integer> characterCount = new HashMap<>();
        for (Character character : characters) {
            if (characterCount.containsKey(character)) {
                characterCount.put(character, characterCount.get(character) + 1);
            } else {
                characterCount.put(character, 1);
            }
        }
        return characterCount;
    }

    static Character findMostCommon (HashMap<Character, Integer> charactersInHashMap) {
        return Collections.max(charactersInHashMap.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

}
