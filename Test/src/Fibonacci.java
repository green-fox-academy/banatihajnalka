public class Fibonacci {

    public int Fibonacci(int number) {

        if (number <= 1) {
            return number;
        } else {
            return Fibonacci(number - 1) + Fibonacci(number - 2);
        }
    }
}
