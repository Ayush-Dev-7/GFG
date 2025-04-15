package week1.module3;

public class _01_CountDigits {
    public static void main(String[] args) {
        System.out.println("While : " + countDigits(473));
        System.out.println("For : " + countDigitsIterative(473));
        System.out.println("Recursive : " + countDigitsRecursive(473, 0));
    }

    private static int countDigits(int num) {
        int count = 0;
        if (num < 0) {
            return 0;
        }
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    private static int countDigitsIterative(int num) {
        int count = 0;
        for (; num > 0; ) {
            num /= 10;
            count++;
        }
        return count;
    }

    private static int countDigitsRecursive(int num, int count) {
//        System.out.println(num + " | " + count);
        if (num <= 0) {
            return count;
        }
        return countDigitsRecursive(num / 10, ++count);
    }
}
