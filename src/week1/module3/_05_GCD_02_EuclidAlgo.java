package week1.module3;

public class _05_GCD_02_EuclidAlgo {

    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor : " + hcf(8, 30));
    }

    private static int hcf(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}
