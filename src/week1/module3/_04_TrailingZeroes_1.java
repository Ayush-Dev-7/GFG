package week1.module3;

public class _04_TrailingZeroes_1 {
    public static void main(String[] args) {
        System.out.println("Trailing 0s : " + trailingZeroes(6));
    }

    private static int trailingZeroes(int num) {
        int fact = 1, count = -1, lastDigit = 0;
        while (num > 0) {
            fact = fact * num--;
        }
        System.out.println("factorial : " + fact);
        while (fact > 0 && lastDigit == 0) {
            lastDigit = fact % 10;
            fact = fact / 10;
            count++;
        }
        return count;
    }
}
