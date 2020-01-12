package WeeklyFeedbackEvaluator;

import java.util.HashMap;
import java.util.Map;

public class Print extends SplitTextToHashMap {

    public static void print(HashMap<String, Float> map) {
        for (Map.Entry<String, Float> average : map.entrySet()) {
            System.out.println(average.getKey() + " : " + average.getValue());
        }
    }
}
