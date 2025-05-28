package week2.module1_recursion;

public class _12_JosephusProblem {
    public static void main(String[] args) {
        int numberOfPeople = 5;
        int k = 3;
        System.out.println(logic(numberOfPeople, k));
    }

    private static int logic(int numberOfPeople, int k) {
        if (numberOfPeople == 1)
            return 0;
        else
            return ((logic(numberOfPeople - 1, k) + k) % numberOfPeople);
    }
}
