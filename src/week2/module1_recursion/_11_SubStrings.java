package week2.module1_recursion;

public class _11_SubStrings {
    public static void main(String[] args) {
        String str = "abc";
        String curr = "";
        logic(str, curr, 0);
    }

    public static void logic(String str, String curr, int i) {
        if (i == str.length()) {
            System.out.print(curr + " ");
            return;
        }
        logic(str,curr,i+1);
        logic(str, curr+str.charAt(i),i+1);
    }
}
