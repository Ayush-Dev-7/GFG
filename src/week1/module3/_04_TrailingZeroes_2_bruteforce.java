package week1.module3;

public class _04_TrailingZeroes_2_bruteforce {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(100));
    }

    private static int trailingZeroes(int num) {
        int count = 0, temp = 0;
        for (int i = num; i > 1; i--) {
            temp = i;
            while (temp % 5 == 0 && temp > 0) {
                temp = temp / 5;
                count++;
            }
        }
        return count;
    }
}
