public class CamelCase {

  public static void main(String[] args) {
    String s = "saveChangesInTheEditor";
    System.out.println(camelcase(s));
  }

  static int camelcase(String s) {
    int counter = 1;
    for (int i = 0; i < s.length(); i++) {
      if (Character.isUpperCase(s.charAt(i))) {
        counter++;
      }
    } return counter;
  }
}
