package week1.module3;

public class _03_Factorial {

    public static void main(String[] args) {
        System.out.println("Iterative : " + factorialOfNumberIteratively(6));
        System.out.println("Iterative : " + factorialOfNumberRecursively(6));
    }

//    TC : Theta(n) | SC : Theta(1)   ---> Better Solution
    private static int factorialOfNumberIteratively(int num) {
        int factorial = 1;
        for (; num > 1; num--) {
            factorial = factorial * num;
        }
        return factorial;
    }

//    TC : Theta(n) | SC : Theta(n)
    private static int factorialOfNumberRecursively(int num) {
        if (num == 0)
            return 1;
        return num * factorialOfNumberRecursively(--num);
    }
}
