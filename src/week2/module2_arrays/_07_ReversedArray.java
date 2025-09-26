package week2.module2_arrays;

import java.util.Arrays;

public class _07_ReversedArray {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {7, 7, 7, 7, 7};
//        int[] arr = {7, 7, 1, 2, 3};
        int[] arr = {30, 7, 6, 5, 10};
        logic(arr);
    }

    private static void logic(int[] arr) {
        int temp, last;
        for (int i = 0; i < (double) (arr.length / 2); i++) {
            last = arr.length - 1 - i;
            temp = arr[i];
            arr[i] = arr[last];
            arr[last] = temp;
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }
}
