package week1.module2;

public class _01_SumOfNaturalNumbers {

    public static void main(String[] args) {
        System.out.println("Mathematical Solution : " + mathematicalSolution(20));
        System.out.println("Iterative Solution : " + iterativeSolution(20));
        System.out.println("Iterative Solution : " + iterativeBruteForceSolution(20));
        System.out.println("Recursive Solution : " + recursiveSolution(20));

    }

    private static int mathematicalSolution(int num) {
        return (num * (num + 1) / 2);
    }

    private static int iterativeSolution(int num) {
        int sum = 0;
        for (int i = num; i > 0; i--) {
            sum += i;
        }
        return sum;
    }

    private static int iterativeBruteForceSolution(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                sum++;
            }
        }
        return sum;
    }

    private static int recursiveSolution(int num) {
        if (num == 0)
            return 0;
        return num + recursiveSolution(--num);
    }
}
