package SwearWords;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwearWords {

    public static void main(String[] args) {
        String filename = "src/SwearWords/SwearWords.txt";
        String[] swearWords = {"fuck", "bloody", "cock", "shit", "fucker", "fuckstick", "asshole", "dick", "piss", "cunt"};

        List<String> text = readFile(filename);
        System.out.println(text);

        List<String> splitted = split(text);
        System.out.println(splitted);

        int counter = findSwearWords(splitted, swearWords);
        System.out.println(counter);
    }

    static List<String> readFile (String filename) {

        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }

    private static List<String> split(List<String> text) {
        List<String> splitted = new ArrayList<>();
        for (String string : text) {
            splitted.addAll(Arrays.asList(string.toLowerCase().replace(".", "").replace(",", "").split(" ")));
        }
        return splitted;
    }

    private static int findSwearWords(List<String> splitted, String[] swearWords) {
        int counter = 0;
        for (String remove : swearWords) {
            for (int i = 0; i < splitted.size(); i++) {
                if (remove.equals(splitted.get(i))) {
                    counter++;
                    splitted.remove(remove);
                }
            }
        }
        return counter;
    }
}
