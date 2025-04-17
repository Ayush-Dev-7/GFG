package week1.module3;

public class _04_TrailingZeroes_2_optimised {
    public static void main(String[] args) {
        System.out.println(trailingZeroes(6));
    }

    private static int trailingZeroes(int num) {
        int count = 0;
        for (int i = 5; i <= num; i=i*5) {
            count = count+num/i;
        }
        return count;
    }
}
