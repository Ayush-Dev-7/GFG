package week2.module2_arrays;

import java.util.Arrays;

public class _11_MaximumDifference {
    public static void main(String[] args) {
        int[] arr = {2, 3, 10, 6, 4, 8, 1};
        System.out.print("Original array : ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Optimised : ");
        naive(arr);
    }

    public static void naive(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] > max) {
                    max = arr[j] - arr[i];
                }
            }
        }
        System.out.println(max);
    }
}
