public class FibonacciIterative {
    private FibonacciIterative(){}
    public static long fibonacci(int number) {
        if (number <= 1) {
            return number;
        }
        long fib1 = 0;
        long fib2 = 1;
        long fib = 0;

        for (int i = 2; i <= number; i++) {
            fib = fib2 + fib1;
            fib1 = fib2;
            fib2 = fib;
        }

        return fib;
    }
}
