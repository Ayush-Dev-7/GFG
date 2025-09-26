package week2.module2_arrays;

import java.util.Arrays;
import java.util.Random;

public class _09_ShiftZeros {
    public static void main(String[] args) {
//        int[] arr = {3, 5, 0, 7, 0, 2};
        int[] arr = {0, 0, 2, 3, 5};
        System.out.print("Original array : ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Optimised : ");
        optimised(arr);
        System.out.println();
        System.out.print("Two Pointer : ");
        twoPointer(arr);
//        benchmark();
    }

    private static void optimised(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != count) {
                    arr[count] = arr[i];
                    arr[i] = 0;
                }
                count++;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

    private static void twoPointer(int[] arr) {
        int pointer1 = 0, zerPointer = -1;
        for (; pointer1 < arr.length; pointer1++) {
            if (arr[pointer1] == 0) {
                if (zerPointer == -1)
                    zerPointer = pointer1;
            } else if (zerPointer != -1) {
                arr[zerPointer] = arr[pointer1];
                arr[pointer1] = 0;
                zerPointer++;
            }
        }
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
    }

    // ---------- Helper ----------
//    public static int[] generateArray(int size, double zeroProbability) {
//        Random rand = new Random();
//        int[] arr = new int[size];
//        for (int i = 0; i < size; i++) {
//            arr[i] = (rand.nextDouble() < zeroProbability) ? 0 : rand.nextInt(1000);
//        }
//        return arr;
//    }
//
    // ---------- Benchmarking ----------
//    public static void benchmark() {
//        int size = 1_000_000; // 1 million elements
//        double zeroProbability = 0.3; // ~30% zeros
//
//        int[] arr1 = generateArray(size, zeroProbability);
//        int[] arr2 = arr1.clone();
//
//        // Measure Version 1
//        long start1 = System.nanoTime();
//        optimised(arr1);
//        long end1 = System.nanoTime();
//
//        // Measure Version 2
//        long start2 = System.nanoTime();
//        twoPointer(arr2);
//        long end2 = System.nanoTime();
//
//        System.out.println("Version 1 Time: " + (end1 - start1) / 1_000_000.0 + " ms");
//        System.out.println("Version 2 Time: " + (end2 - start2) / 1_000_000.0 + " ms");
//    }
}
