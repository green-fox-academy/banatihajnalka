
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

public class WriteSingleLine {
        public static void main(String[] args) {
            // Write a function that is able to manipulate a file
            // By writing your name into it as a single line
            // The file should be named "my-file.txt"
            // In case the program is unable to write the file,
            // It should print the following error message: "Unable to write file: my-file.txt"

            String filename = "my-file.txt";
            String writeInto = "Hajni";
            writeIntoFunction(writeInto, filename);
        }

    private static void writeIntoFunction(String writeInto, String filename) {
            Path filePath = Paths.get(filename);
            List<String> textInto = new ArrayList<>();
        try {
            textInto = Files.readAllLines(filePath);
            textInto.add(writeInto);
            Files.write(filePath, textInto);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + filename);
        }
        System.out.println(textInto);

    }
}

