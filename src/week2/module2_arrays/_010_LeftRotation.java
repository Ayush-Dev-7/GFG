package week2.module2_arrays;

import java.util.Arrays;

public class _010_LeftRotation {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};
        System.out.print("Original array : ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Naive : ");
        naive(arr, 3);
        System.out.println();
        System.out.print("Optimised : ");
        recursion(arr2, 0, 3);
        Arrays.stream(arr2).forEach(i -> System.out.print(i + " "));
    }

    private static void naive(int[] arr, int times) {
        int temp;
        for (int rotationCount = 0; rotationCount < times; rotationCount++) {
            temp = arr[0];
            for (int internalCounter = 0; internalCounter < arr.length - 1; internalCounter++) {
                arr[internalCounter] = arr[internalCounter + 1];
            }
            arr[arr.length - 1] = temp;
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

    private static void library(int[] arr, int times) {
        int[] aux = new int[arr.length];
        System.arraycopy(arr, times, aux, 0, arr.length - times);
        System.arraycopy(arr, 0, aux, arr.length - times, times);
        Arrays.stream(aux).forEach(i -> System.out.print(i + " "));
    }

    private static void recursion(int[] arr, int start, int times) {
        logic(arr, start, times);
        if (times >= 1)
            recursion(arr, arr.length - times, --times);
    }

    private static void logic(int[] arr, int start, int times) {
        int temp;
        for (int i = start; i <= arr.length - times - 1; i++) {
            temp = arr[i];
            arr[i] = arr[i+times];
            arr[i+times] = temp;
        }
    }
}
