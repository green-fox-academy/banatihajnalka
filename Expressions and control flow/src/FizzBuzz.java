public class FizzBuzz {
    public static void main(String[] args) {
        for (int a = 1; a <= 100; a++) {
            if (a % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (a % 5 == 0) {
                System.out.println("Buzz");
            } else if (a % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(a);
            }
        }
    }
}