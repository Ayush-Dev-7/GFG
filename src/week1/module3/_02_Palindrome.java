package week1.module3;

public class _02_Palindrome {
    public static void main(String[] args) {
        System.out.println("Iteratively : " + isPalindromeIteratively(123321));
//        System.out.println("Recursively : " + isPalindromeTwoPointer(12213));
    }

    private static boolean isPalindromeIteratively(int number) {
        int sum = 0, remainder = 0, temp = number;
        while (temp > 0) {
            remainder = temp % 10;
            temp = temp / 10;
            sum = sum * 10 + remainder;
        }
        if (sum == number)
            return true;
        return false;
    }

//    private static boolean isPalindromeTwoPointer(int number) {
//        int digits = countDigits(number, 0);
//        System.out.println("digits : " + digits);
//        boolean flag = true;
//        int[] arr = new int[digits];
//        System.out.println();
//        for (int i = 0; i <= digits / 2; i++) {
//            System.out.println(arr[i] + " | " + arr[arr.length - 1 - i]);
//            if (arr[i] != arr[arr.length - 1 - i]) {
//                flag = false;
//                break;
//            }
//        }
//        return flag;
//    }
//
//    private static int countDigits(int number, int count) {
//        if (number <= 0) {
//            return count;
//        }
//        return countDigits(number / 10, ++count);
//    }
}
