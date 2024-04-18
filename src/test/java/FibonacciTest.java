import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {

    @Test
    void fibonacciWhenLong1ThenReturnLong0() {
        //GIVEN
        long n = 1;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciWhenLong2ThenReturnLong1() {
        //GIVEN
        long n = 2;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciWhenLong3ThenReturnLong1() {
        //GIVEN
        long n = 3;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciWhenLong5ThenReturnLong3() {
        //GIVEN
        long n = 5;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciWhenLong13ThenReturnLong144() {
        //GIVEN
        long n = 13;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 144;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void fibonacciWhenLong51ThenReturnLong12586269025() {
        //GIVEN
        long n = 51;

        //WHEN
        long actual = Fibonacci.fibonacci(n);

        //THEN
        long expected = 12586269025;
        Assertions.assertEquals(expected, actual);
    }
}