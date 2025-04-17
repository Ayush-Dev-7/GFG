package week1.module3;

public class _06_LCM_01_UsingEuclidsAlgo {
    public static void main(String[] args) {
        System.out.println("Least Common Multiple : " + lcm(8, 25));
    }

    //    According to Euclid's algorithm --> a*b = GCD(a,b) * LCM(a,b)
    private static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    private static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
