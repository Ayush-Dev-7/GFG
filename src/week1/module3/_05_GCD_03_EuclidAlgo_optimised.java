
package week1.module3;

public class _05_GCD_03_EuclidAlgo_optimised {

    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor : " + hcf(15, 30));
    }

    private static int hcf(int a, int b) {
        if (b == 0) {
            return a;
        }
        return hcf(b, a % b);
    }
}
