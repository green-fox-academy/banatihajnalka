//Write a method which can read and parse a file containing information about weekly feedback from apprentices about a mentor.
///The mentor is rated in 4 different metrics, those are respectively (matReview, presSkills, helpfulness, explanation) separated with 1 space:
//        m = matReview
//        p = presSkills
//        h = helpfulness
//        e = explanation
//The method must return a map/dictionary containing the average rating (in each metric) of the mentor.

package WeeklyFeedbackEvaluator;

import static WeeklyFeedbackEvaluator.Print.print;
import static WeeklyFeedbackEvaluator.ReadFile.readFile;
import static WeeklyFeedbackEvaluator.SplitTextToHashMap.textToHashMap;

public class MainFeedback  {

    public static void main(String[] args) {

      print(textToHashMap(readFile("src/WeeklyFeedbackEvaluator/Feedback.txt")));

    }
}
