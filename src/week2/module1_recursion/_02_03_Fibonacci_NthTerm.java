package week2.module1_recursion;

public class _02_03_Fibonacci_NthTerm {

    public static void main(String[] args) {
        int val = 5;
        System.out.println("Value at " + val + " position of fibonacci series starting from 0th position : " + fibonacciY(val-2, 0, 1));
    }

    private static int fibonacciY(int i, int a, int b) {
        if (i == 0)
            return b;
        return fibonacciY(--i, b, a + b);
    }
}
