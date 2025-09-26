package week2.module2_arrays;

import java.util.Arrays;

public class _04_IndexOfLargest {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 63;
        arr[3] = 44;
        arr[4] = 55;
        System.out.println(logic(arr));
    }

    private static String logic(int[] arr) {
        int max = 0, i = 0, pos = 0;
        if (arr.length == 0)
            return "array is empty";
        for (; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                pos = i;
            }
        }
        return "found at index : " + pos + " | value : " + max;
    }
}
