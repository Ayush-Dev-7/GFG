package week1.module3;

public class _06_LCM_01_optimised {
    public static void main(String[] args) {
        System.out.println("Least Common Multiple : " + lcm(4, 25));
    }

    private static int lcm(int a, int b) {
        for (int i = 1; ; i++) {
            if ((Math.max(a, b) * i) % (Math.min(a, b)) == 0)
                return (Math.max(a, b) * i);
        }
    }
}
