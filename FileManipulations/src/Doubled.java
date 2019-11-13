import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Doubled {

    public static void main(String[] args) {
        // Create a method that decrypts the duplicated-chars.txt
        String doubledSource = "DoubledSource.txt";
        //      String decryptedVersion = "DecryptedVersion.txt";

        Path filePath = Paths.get(doubledSource);
        List<String> fromDecrypt = new ArrayList<>();
        try {
            fromDecrypt = Files.readAllLines(filePath);
        } catch (IOException e) {
        }
        System.out.println(fromDecrypt);

        String[] deCrypetd = deCryptedArray(fromDecrypt);
  //      System.out.println(deCrypetd);
    }

    private static String[] deCryptedArray(List<String> fromDecrypt) {
        int length = fromDecrypt.size();
        String[] output = new String[length];
        for (int i = 0; i < fromDecrypt.size(); i++) { //minden soron
            for (int j = 0; j < fromDecrypt.get(i).length(); j += 2) {  //minden betun
                System.out.print(fromDecrypt.get(i).charAt(j));
            }
            System.out.println();
        }
        return output;
    }
}