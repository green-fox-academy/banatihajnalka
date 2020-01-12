//Write a method which can read and parse a file containing information about weekly feedback from apprentices about a mentor.
///The mentor is rated in 4 different metrics, those are respectively (matReview, presSkills, helpfulness, explanation) separated with 1 space:
//        m = matReview
//        p = presSkills
//        h = helpfulness
//        e = explanation
//The method must return a map/dictionary containing the average rating (in each metric) of the mentor.

package WeeklyFeedbackEvaluator;

import java.util.HashMap;
import java.util.Map;

public class MainFeedback extends Print {

    public static void main(String[] args) {

      print(textToHashMap(readFile("C:\\HAJNI\\greenfox\\banatihajnalka\\OldFoundationExam\\src\\WeeklyFeedbackEvaluator\\Feedback.txt")));
    }
}
