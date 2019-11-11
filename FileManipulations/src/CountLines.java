import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CountLines {
    public static void main(String[] args) {
        // Write a function that takes a filename as string,
        // then returns the number of lines the file contains.
        // It should return zero if it can't open the file, and   "Unable to read file: " + counter
        // should not raise any error.

        String filename =  "my-file.txt";
        countNumberOfLInes(filename);
    }

    private static void countNumberOfLInes(String counter) {
        Path filePath = Paths.get(counter);
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(filePath);
        } catch (IOException e) {
            System.out.println("Unable to read file: " + counter);
        }
            System.out.println(text.size());
        }
    }
