public class Fibonacci {
    public static long fibonacci(long n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        }

        long a = 0;
        long b = 1;

        for (long i = 2; i < n; i++) {
            long c = b;
            b = a + b;
            a = c;
        }

        return b;
    }
}
