package week2.module1_recursion;

public class _10_CutTheRope {
    public static void main(String[] args) {
        int num = 12, a = 4, b = 5, c = 3;
        System.out.println(logic(num, a, b, c));
    }

    private static int logic(int num, int a, int b, int c) {
        if (num == 0)
            return 0;
        if (num < 0)
            return -1;
        int res = Math.max(logic(num - a, a, b, c),
                (Math.max(logic(num - b, a, b, c), logic(num - c, a, b, c))));
        if (res == -1)
            return -1;
        return res + 1;
    }
}
