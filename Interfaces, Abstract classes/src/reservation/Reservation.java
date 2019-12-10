package reservation;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Reservation implements HowToReserve {
    private String code;
    private String day;

    public Reservation() {
        code = getCodeBooking();
        day = getDowBooking();
    }

    @Override
    public String getDowBooking() {
        List<String> dayOfWeeks = Arrays.asList("MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN");
        Random random = new Random();
        int dowRandom = random.nextInt(dayOfWeeks.size());
        return dayOfWeeks.get(dowRandom);
    }

    @Override
    public String getCodeBooking() {
        String chars = "ABSDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "1234567890";
        String dataForString = chars + numbers;
        StringBuilder generatedID = new StringBuilder(8);
        Random random = new Random();
        for (int i = 0; i < 8 ; i++) {
            int randomCharAt = random.nextInt(dataForString.length());
            char randomChar = dataForString.charAt(randomCharAt);
            generatedID.append(randomChar);
        }
        return generatedID.toString();
    }

    @Override
    public String toString() {
        return "Booking# " + code + " for " + day;
    }
}
