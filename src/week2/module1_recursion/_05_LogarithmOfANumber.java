package week2.module1_recursion;

//logic :
// divide N by BASE until N becomes less than base, increment the count at every division,
// Analogy :
// “If you have a bucket of water, and you pour out a fixed fraction (say, half) of what's left each time,
// then the number of times you need to do this until the bucket is empty is proportional to the logarithm
// (base 2, in this case) of the original water amount.”

public class _05_LogarithmOfANumber {
    public static void main(String[] args) {
        int num = 32;
        System.out.println("Floor(Log " + num + " base 2) = " + logBase2(num));

    }

    private static int logBase2(int num) {
        if (num == 1)
            return 0;
        return 1 + logBase2(num / 2);
    }
}
