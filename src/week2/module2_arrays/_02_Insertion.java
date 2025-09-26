package week2.module2_arrays;

import java.util.Arrays;

public class _02_Insertion {
    public static void main(String[] args) {
        int pos = 2;
        int val = 33;
        int size = 5;
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 66;
        System.out.println(logic(arr, size, pos, val));
    }

    private static String logic(int[] arr, int size, int position, int value) {
        if (size == arr.length)
            return "already full";
        for (int i = size - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = value;
        Arrays.stream(arr).forEach(System.out::println);
        return "added";
    }
}
