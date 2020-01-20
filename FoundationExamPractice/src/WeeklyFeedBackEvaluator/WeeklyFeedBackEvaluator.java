package WeeklyFeedBackEvaluator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class WeeklyFeedBackEvaluator {

    public static List<String> readFile(String filename) {
        List<String> text = new ArrayList<>();
        try {
            text = Files.readAllLines(Paths.get(filename));
        } catch (IOException e) {
            System.out.println("File does not exists");
        }
        return text;
    }

    public static HashMap<String, Float> feedBackToHashMap(List<String> text) {
        float matReview = 0;
        float presSkills = 0;
        float helpfulness = 0;
        float explanation = 0;
        for (String rate : text) {
            List<String> splitted = Arrays.asList(rate.split(" "));
            matReview += Integer.parseInt(splitted.get(0));
            presSkills += Integer.parseInt(splitted.get(1));
            helpfulness += Integer.parseInt(splitted.get(2));
            explanation += Integer.parseInt(splitted.get(3));
        }
        HashMap<String, Float> feedBackHashMap = new HashMap<>();
        feedBackHashMap.put("matReview", (float) matReview / text.size());
        feedBackHashMap.put("preSkills", (float) presSkills / text.size());
        feedBackHashMap.put("helpfulness", (float) helpfulness / text.size());
        feedBackHashMap.put("explanation", (float) explanation / text.size());
        return feedBackHashMap;
    }
}

