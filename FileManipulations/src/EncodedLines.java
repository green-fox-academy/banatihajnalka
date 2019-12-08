import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodedLines {
    private static Object Joiner;

    public static void main(String[] args) {
        String filename = "encodedLines.txt";
        List<String> text = readFile(filename);

        List<List<Character>> characterList = shiftedChar(text);
        System.out.println(characterList);

        String decryptedString = charListToString(characterList);
        System.out.println(decryptedString);
//        System.out.println(Arrays.toString(decryptedString(i)));

////        String result = "";
////        for (int i = 0; i < decryptedString.length() ; i++) {
////            for (int j = 0; j < decryptedString.get(i); j++) {
////
////            }
//            System.out.println(decryptedString(i));
//        }
    }

    private static String charListToString(List<List<Character>> characterList) {
       StringBuilder builder = new StringBuilder();
       for (List<Character> ch : characterList) {
           builder.append(ch);
        }
        return builder.toString().replace("\u001F", " ").replace(", ", "");
    }

    private static List<List<Character>> shiftedChar(List<String> text) {
        List<List<Character>> characterList = new ArrayList<>();
        for (int i = 0; i < text.size() ; i++) {
            List<Character> currentCharacters = new ArrayList<>();
            for (int j = 0; j < text.get(i).length(); j++) {
                char currentChar = text.get(i).charAt(j);
                currentChar--;
                currentCharacters.add(currentChar);
            }
            characterList.add(currentCharacters);
        } return characterList;
    }

    private static List readFile(String filename) {
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filename));
            System.out.println(text);
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }
}
