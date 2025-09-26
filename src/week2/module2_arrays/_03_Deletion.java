package week2.module2_arrays;

import java.util.Arrays;

public class _03_Deletion {
    public static void main(String[] args) {
        int pos = 2;
        int[] arr = new int[5];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        arr[4] = 55;
        System.out.println(logic(arr, pos, arr.length));
    }

    private static String logic(int[] arr, int position, int size) {
        if (size == 0)
            return "already empty";
        for (int i = position - 1; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        Arrays.stream(arr).forEach(num -> System.out.print(num + " "));
        return "removed";
    }
}
