package week2.module2_arrays;

public class _05_SecondLargestElements {
    public static void main(String[] args) {
//        int[] arr = {25, 101, 20, 52, 42};
//        int[] arr = {7, 7, 7, 7, 7};
        int[] arr = {7, 7, 1, 2, 3};
        System.out.println(logic(arr));
    }

    private static int logic(int[] arr) {
        if (arr == null || arr.length < 2) return -1;
        int maxIndex = 0;
        int secondMaxIndex = -1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                secondMaxIndex = maxIndex;
                maxIndex = i;
            } else if (arr[i] < arr[maxIndex]) {
                if (secondMaxIndex == -1 || arr[i] > arr[secondMaxIndex]) {
                    secondMaxIndex = i;
                }
            }
        }
        return secondMaxIndex;
    }
}
