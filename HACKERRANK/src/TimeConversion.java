import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

  public static void main(String[] args) throws ParseException {
    String time = "07:05:45PM";
    System.out.println(timeConversion(time));
  }

  static String timeConversion(String s) {
    int hour = Integer.parseInt(s.substring(0, 2))%12;
    int minute = Integer.parseInt(s.substring(3, 5));
    int second = Integer.parseInt(s.substring(6, 8));
    if (s.contains("PM")) {
      hour += 12;
    }
    return String.format("%02d:%02d:%02d",hour,minute,second);
  }


}
