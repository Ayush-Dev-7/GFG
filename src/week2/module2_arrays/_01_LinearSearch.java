package week2.module2_arrays;

public class _01_LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4};
        int key = 3;
        System.out.println(logic(arr, key));
    }

    private static int logic(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key)
                return i;
        return -1;
    }
}
