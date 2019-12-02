import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {
    private static Object Joiner;

    public static void main(String[] args) {
        String filename = "encodedLines.txt";
        List<String> text = readFile(filename);

        List<Character> characterList = shiftedChar(text);
        System.out.println(characterList);

        String decryptedString = charListToString(characterList);
        System.out.println(decryptedString);

    }

    private static String charListToString(List<Character> characterList) {
       StringBuilder builder = new StringBuilder();
       for (Character ch : characterList) {
           builder.append(ch);
        }
        String decryptedString = builder.toString().replace("\u001F", " ");
       return decryptedString;
    }

    private static List<Character> shiftedChar(List<String> text) {
        List<Character> characterList = new ArrayList<>();
        for (int i = 0; i < text.size() ; i++) {
            for (int j = 0; j < text.get(i).length(); j++) {
                char characters = ' ';
                characters = text.get(i).charAt(j);
                characters--;
                characterList.add(characters);
            }
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
