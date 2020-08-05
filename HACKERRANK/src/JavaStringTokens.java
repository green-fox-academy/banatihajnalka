import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class JavaStringTokens {

  public static void main(String[] args) {

    String input = "He is a very very good boy, isn't he?";
    String regex = "[ !,?.\\\\_'@]";
    String delimiter = "[ !,?.\\_'@]+";
    System.out.println(splittingToken(input, delimiter));
    System.out.println(splittingToken2(input, regex));

  }

  private static Integer splittingToken(String input, String delimiter) {
    List<String> splitted = Arrays.asList(input.split(delimiter));
    return splitted.size();
  }

  private static Integer splittingToken2(String input, String regex) {
    StringTokenizer tokens = new StringTokenizer(input, regex);
    return tokens.countTokens();
  }


}
