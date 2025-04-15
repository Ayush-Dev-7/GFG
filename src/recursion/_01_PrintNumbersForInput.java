package recursion;

public class _01_PrintNumbersForInput {

    public static void main(String[] args) {
        recursiveSolution(10);
    }

    private static void recursiveSolution(int num) {
        if (num > 0) {
            recursiveSolution(num - 1);
            System.out.print(" " + num);
        }
    }
}
