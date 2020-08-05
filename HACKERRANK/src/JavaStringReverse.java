public class JavaStringReverse {

  public static void main(String[] args) {

    String A = "madam";
    StringBuilder rev = new StringBuilder();
      rev.append(A).reverse();
      if (A.equals(rev.toString())) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }
  }

}
