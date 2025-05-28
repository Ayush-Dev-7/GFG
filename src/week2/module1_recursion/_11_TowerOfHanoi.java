package week2.module1_recursion;

public class _11_TowerOfHanoi {

    public static void main(String[] args) {
        int numberOfDiscs = 4;
        logic(numberOfDiscs, "A", "B", "C");
    }

    private static void logic(int discs, String src, String aux, String dest) {
        if (discs == 1) {
            System.out.println("Move 1 from : " + src + " to : " + dest);
            return;
        }
        logic(discs - 1, src, dest, aux);
        System.out.println("Move " + discs + " from : " + src + " to : " + dest);
        logic(discs - 1, aux, src, dest);
    }
}
