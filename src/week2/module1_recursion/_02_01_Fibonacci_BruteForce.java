package week2.module1_recursion;

public class _02_01_Fibonacci_BruteForce {

    public static void main(String[] args) {
        int val = 4;
        fibonacciX(val);
    }

    private static void fibonacciX(int i) {
        int a = 0, b = 1, temp;
        while (i >= 0) {
            temp = a;
            a = b;
            System.out.print(temp + "  ");
            b = b + temp;
            i--;
        }
    }
}
