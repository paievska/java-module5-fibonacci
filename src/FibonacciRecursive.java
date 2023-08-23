public class FibonacciRecursive {
    private FibonacciRecursive() {
    }

    public static long fibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        return fibonacci(number - 1) + fibonacci(number - 2);
    }
}
