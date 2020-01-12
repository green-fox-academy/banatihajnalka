package WeeklyFeedbackEvaluator;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class SplitTextToHashMap extends ReadFile {

    public static HashMap<String, Float> textToHashMap(List<String> ratings) {
        int matReview = 0;
        int presSkills = 0;
        int helpfulness = 0;
        int explanation = 0;

        for (String rate : ratings) {
            List<String> splitted = Arrays.asList(rate.split(" "));
            matReview += Integer.parseInt(splitted.get(0));
            presSkills += Integer.parseInt(splitted.get(1));
            helpfulness += Integer.parseInt(splitted.get(2));
            explanation += Integer.parseInt(splitted.get(2));
        }

        float averageMatReview = (float) matReview / ratings.size();
        float averagePreskills = (float) presSkills / ratings.size();
        float averageHelpfulness = (float) helpfulness / ratings.size();
        float averageExplanation = (float) explanation / ratings.size();

        HashMap<String, Float> averageMap = new HashMap<>();
        averageMap.put("matReview", averageMatReview);
        averageMap.put("averagePreskills", averagePreskills);
        averageMap.put("averageHelpfulness", averageHelpfulness);
        averageMap.put("averageExplanation", averageExplanation);

        return averageMap;
    }
}
