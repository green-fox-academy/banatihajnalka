public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int currentTime = (currentHours * 60 * 60) + (currentMinutes * 60) + (currentSeconds);
        System.out.println(currentTime);
        int holeDay = 24 * 60 * 60;
        System.out.println(holeDay);
        System.out.println("The remaining seconds of the day is: " + (holeDay - currentTime));
    }
}
