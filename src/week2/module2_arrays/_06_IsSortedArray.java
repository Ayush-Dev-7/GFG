package week2.module2_arrays;

import java.util.Arrays;

public class _06_IsSortedArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {7, 7, 7, 7, 7};
        int[] arr = {7, 7, 1, 2, 3};
        System.out.println(logic(arr));
    }

    private static boolean logic(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
