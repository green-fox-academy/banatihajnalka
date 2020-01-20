package WeeklyFeedBackEvaluator;

import java.util.HashMap;
import java.util.List;

import static WeeklyFeedBackEvaluator.WeeklyFeedBackEvaluator.feedBackToHashMap;
import static WeeklyFeedBackEvaluator.WeeklyFeedBackEvaluator.readFile;

public class MainWeeklyFeedBack {

    public static void main(String[] args) {

        List<String> feedBack = readFile("src/WeeklyFeedBackEvaluator/FeedBack.txt");

        HashMap<String, Float> feedBackHashMap = feedBackToHashMap(feedBack);
        feedBackHashMap.entrySet().forEach(entry->{
            System.out.println(entry.getKey() + " " + entry.getValue());
        });

    }
}
