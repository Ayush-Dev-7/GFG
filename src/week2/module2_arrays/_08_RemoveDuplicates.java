package week2.module2_arrays;

import java.util.Arrays;

public class _08_RemoveDuplicates {
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};
//        int[] arr = {7, 7, 7, 7, 7};
//        int[] arr = {7, 7, 1, 2, 3};
        int[] arr = {10, 10, 10, 20, 20, 30, 30, 30};
        logic2(arr);
    }

    private static void logic(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[j] = -1;
                }
            }
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != -1) {
                        arr[i] = arr[j];
                        arr[j] = -1;
                        break;
                    }
                }
            }
        }
    }

    private static void logic2(int[] arr) {
        int[] auxiliary = new int[arr.length];
        int top = 0;
        auxiliary[top] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != auxiliary[top]) {
                auxiliary[top + 1] = arr[i];
                top++;
            }
        }
        Arrays.stream(auxiliary).forEach(e -> System.out.print(e + " "));
        System.out.println("\nDistinct elements : " + (top + 1));
    }
}
