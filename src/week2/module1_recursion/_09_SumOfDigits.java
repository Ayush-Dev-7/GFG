package week2.module1_recursion;

public class _09_SumOfDigits {
    public static void main(String[] args) {
        int num = 10;
        System.out.println(logic(num, 0));
    }

    private static int logic(int num, int sum) {
        if (num == 0)
            return sum;
        sum = sum + num % 10;
        return logic(num / 10, sum);
    }
}
