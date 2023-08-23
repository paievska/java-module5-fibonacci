public class Main {
    public static void main(String[] args) {
        int n = 10;
        long result1 = FibonacciIterative.fibonacci(n);
        long result2 = FibonacciRecursive.fibonacci(n);
        long result3 = FibonacciDP.fibonacci(n);
        System.out.println("Fibonacci Iterative(" + n + ") = " + result1);
        System.out.println("Fibonacci Recursive(" + n + ") = " + result2);
        System.out.println("Fibonacci Dynamic(" + n + ") = " + result3);
    }
}