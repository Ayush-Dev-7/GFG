package week2.module1_recursion;

public class _07_SumOfNaturalNumbers {
    public static void main(String[] args) {
        System.out.println(logic(0, 10));
    }

    private static int logic(int sum, int num) {
        if (num == 0)
            return sum;
        return logic(sum + num, --num);
    }
}
