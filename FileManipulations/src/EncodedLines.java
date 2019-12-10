import java.io.File;
import java.io.FileWriter;
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

        List<List<Character>> characterList = shiftedChar(text);
        System.out.println(characterList);

        String decryptedString = charListToString(characterList);
        System.out.println(decryptedString);

   //     characterList.forEach(System.out::println);

        writeFile(decryptedString);
    }

    private static void writeFile(String stringToWrite) {
        File decrypted = new File("decryptedLines.txt");
        FileWriter fr = null;
        try {
            fr = new FileWriter(decrypted);
            fr.write(stringToWrite);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
//close resources
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static String charListToString(List<List<Character>> characterList) {
        StringBuilder builder = new StringBuilder();
        for (List<Character> row : characterList) {
            for (Character letter : row) {
                builder.append(letter);
            }
            builder.append("\n");
        }
        return builder.toString().replace("\u001F", " ").replace(", ", "");
    }

    private static List<List<Character>> shiftedChar(List<String> text) {
        List<List<Character>> characterList = new ArrayList<>();
        for (int i = 0; i < text.size(); i++) {
            List<Character> currentCharacters = new ArrayList<>();
            for (int j = 0; j < text.get(i).length(); j++) {
                char currentChar = text.get(i).charAt(j);
                currentChar--;
                currentCharacters.add(currentChar);
            }
            characterList.add(currentCharacters);
        }
        return characterList;
    }

    private static List<String> readFile(String filename) {
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
