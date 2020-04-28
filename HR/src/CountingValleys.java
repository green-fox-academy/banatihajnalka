//Gary is an avid hiker. He tracks his hikes meticulously, paying close attention to small details like topography.
//        During his last hike he took exactly  steps. For every step he took, he noted if it was an uphill, , or a downhill,  step.
//        Gary's hikes start and end at sea level and each step up or down represents a  unit change in altitude.
//        countingValleys has the following parameter(s):
//        n: the number of steps Gary takes
//        s: a string describing his path

public class CountingValleys {

    public static void main(String[] args) {
        int numberOfSteps = 8;
        String path = "UDDDUDUU";

        System.out.println(countingValleys(numberOfSteps,path));
    }

    private static int countingValleys(int n, String s) {
        char[] steps = s.toCharArray();
        int altitude = 0;
        int valley = 0;

        for (Character step : steps) {
            if (step.equals('D')) {
                altitude--;
            } else {
                altitude++;
                if (altitude == 0) {
                    valley++;
                }
            }
        }
        return valley;

    }
}
