import static java.lang.Math.max;

public class StrongPassword {

  public static void main(String[] args) {
    String password2 = "4700";
    String password = "goxg";
    int passwordLength = 4;
    System.out.println(minimumNumber(passwordLength, password));
  }

  private static int minimumNumber(int n, String password) {
    String specialChar = "!@#$%^&*()-+";
    boolean hasUpperCase = false;
    boolean hasLowerCase = false;
    boolean hasDigit = false;
    boolean hasSpecChar = false;
    for (int i = 0; i < password.length(); i++) {
      if (Character.isUpperCase(password.charAt(i))) {
        hasUpperCase = true;
        continue;
      }
      if (Character.isLowerCase(password.charAt(i))) {
        hasLowerCase = true;
        continue;
      }
      if (Character.isDigit(password.charAt(i))) {
        hasDigit = true;
        continue;
      }
      if (specialChar.contains(String.valueOf(password.charAt(i)))) {
        hasSpecChar = true;
      }
    }
    int check = (hasUpperCase ? 0 : 1) + (hasLowerCase ? 0 : 1) + (hasDigit ? 0 : 1) + (hasSpecChar ? 0 : 1);
    return max(check, 6 - n);
  }

  }
