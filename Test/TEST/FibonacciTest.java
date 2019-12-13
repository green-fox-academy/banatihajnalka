import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {

    private Fibonacci fibonacci = new Fibonacci();

    @Test
    public void Fibonacci_should_returnIndex_when_numberIsZero() {
       int expected = 0;
       int result = fibonacci.Fibonacci(0);

       assertEquals(expected, result);
    }
    @Test
    public void Fibonacci_should_returnIndex_when_numberIsOne() {
        int expected = 1;
        int result = fibonacci.Fibonacci(1);

        assertEquals(expected, result);
    }
    @Test
    public void Fibonacci_should_work_when_randomNumberIsGiven() {
        int expected = 21;
        int result = fibonacci.Fibonacci(8);

        assertEquals(expected, result);
    }


}