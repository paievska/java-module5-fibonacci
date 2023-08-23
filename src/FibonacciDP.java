import java.util.HashMap;
import java.util.Map;

public class FibonacciDP {
    private FibonacciDP(){}
    private static final Map<Integer, Long> memo = new HashMap<>();

    public static long fibonacci(int number) {
        if (number <= 1) {
            return number;
        }

        if (memo.containsKey(number)) {
            return memo.get(number);
        }

        long fib = fibonacci(number - 1) + fibonacci(number - 2);
        memo.put(number, fib);
        return fib;
    }
}
