import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines2 {
    public static void main(String[] args) {

        String filename = "encodedLines.txt";
        List<String> text = readFile(filename);

        int key = -1;
        String decrypted = decryptTextCaesar(text, key);
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

    private static String decryptTextCaesar(List<String> text, int key) {
        String decrypted = " ";
        char character;
        String[] output = new String[text.size()];
        for (int i = 0; i < text.size(); i++) {
            for (int j = 0; j < text.get(i).length(); j++) {
                character = text.get(i).charAt(j);
                System.out.println(character);
                if (character >= 'a' && character >= 'z') {
                    character = (char) (character + key);
                    if (character > 'z') {
                        decrypted += character;
                    }
                } else if (character >= 'A' && character >= 'Z') {
                    character = (char) (character + key);
                    if (character > 'Z') {
                        decrypted += character;
                    } else {
                        decrypted += character;
                    }
                }
            }     System.out.println(decrypted);
        }  return decrypted;
    }
}
