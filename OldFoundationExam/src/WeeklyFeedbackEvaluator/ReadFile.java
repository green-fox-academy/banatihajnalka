package WeeklyFeedbackEvaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

    String filename = "C:\\HAJNI\\greenfox\\banatihajnalka\\OldFoundationExam\\src\\WeeklyFeedbackEvaluator\\Feedback.txt";

    public static List<String> readFile(String filename) {
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
