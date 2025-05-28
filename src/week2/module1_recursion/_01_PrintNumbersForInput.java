package week2.module1_recursion;

public class _01_PrintNumbersForInput {

    public static void main(String[] args) {
        increasingOrder(10);
        System.out.println();
        decreasingOrder(10);
    }

    private static void increasingOrder(int num) {
        if (num == 0)
            return;
        increasingOrder(num - 1);
        System.out.print(" " + num);
    }

    private static void decreasingOrder(int num) {
        if (num == 0)
            return;
        System.out.print(" " + num);
        decreasingOrder(num - 1);
    }
}
