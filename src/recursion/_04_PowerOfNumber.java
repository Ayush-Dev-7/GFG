package recursion;

public class _04_PowerOfNumber {

    public static void main(String[] args) {
        System.out.println(powerOfNumber(11));
    }

    private static double powerOfNumber(int num) {
        return Math.pow(num, reverse(num));
    }

    private static int reverse(int num) {
        int sum = 0, rem = 0;
        while (num > 0) {
            rem = num % 10;
            num = num / 10;
            sum = sum * 10 + rem;
        }
        return sum;
    }
}
