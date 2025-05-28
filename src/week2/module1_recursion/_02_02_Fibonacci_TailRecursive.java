package week2.module1_recursion;

public class _02_02_Fibonacci_TailRecursive {
    public static void main(String[] args) {
        fibonacci(10, 0, 1);
    }

    private static void fibonacci(int num, int a, int b) {
        System.out.print(" " + b);
        if (num == 0)
            return;
        fibonacci(--num, b, a + b);
    }
}