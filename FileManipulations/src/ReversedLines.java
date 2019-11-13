
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReversedLines {

    public static void main(String[] args) {
        // Create a method that decrypts reversed-lines.txt

        String reversedSource = "ReversedLines.txt";
        Path filePath = Paths.get(reversedSource);
        List<String> fromReverse = new ArrayList<>();

        try {
            fromReverse = Files.readAllLines(filePath);
        } catch (IOException e) {
        }
        System.out.println(fromReverse);

        String[] reversed = reversedArrayFunction(fromReverse);
    }

    private static String[] reversedArrayFunction(List<String> fromReverse) {
        int length = fromReverse.size();
        String[] output = new String[length];
        for (int i = 0; i < fromReverse.size(); i++) {
            for (int j = fromReverse.get(i).length() - 1; j > 0; j--) {
                System.out.print(fromReverse.get(i).charAt(j));
            }
            System.out.println();
        }
        return output;
    }
}