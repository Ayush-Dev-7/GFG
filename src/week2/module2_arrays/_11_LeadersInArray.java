package week2.module2_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class _11_LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {7, 10, 4, 3, 6, 5, 2};
        System.out.print("Original array : ");
        Arrays.stream(arr).forEach(i -> System.out.print(i + " "));
        System.out.println();
        System.out.print("Optimised : ");
        optimised(arr);
    }

    private static void optimised(int[] arr) {
        ArrayList<Integer> leaderList = new ArrayList<>();
        leaderList.add(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] > leaderList.getLast())
                leaderList.add(arr[i]);
        }
        System.out.println(leaderList.reversed());
    }
}
