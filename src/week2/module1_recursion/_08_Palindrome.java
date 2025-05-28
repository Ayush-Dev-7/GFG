package week2.module1_recursion;

public class _08_Palindrome {
    public static void main(String[] args) {
        String str = "lalal";
        System.out.println(logic(str, 0, str.length() - 1));
    }

    private static boolean logic(String str, int start, int end) {
        if (start >= end)
            return true;
        if (String.valueOf(str.charAt(start)).equalsIgnoreCase(String.valueOf(str.charAt(end))))
            return logic(str, ++start, --end);
        return false;
    }
}
