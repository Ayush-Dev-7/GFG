package week1.module3;

public class _05_GCD_01_naive {

    public static void main(String[] args) {
        System.out.println("Greatest Common Divisor : " + hcf(15, 45));
    }

    private static int hcf(int a, int b) {

//        can be simplified using Math.min(a,b);
        if (a > b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }

        int gcd = a;
        while (gcd > 0) {
            if (a % gcd == 0 && b % gcd == 0)
                break;
            gcd--;
        }
        return gcd;
    }
}
