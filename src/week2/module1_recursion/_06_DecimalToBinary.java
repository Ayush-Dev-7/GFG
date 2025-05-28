package week2.module1_recursion;

//logic :
// divide N by 2 and store the remainder until N becomes 0,
// then print the collected remainders in reverse order

public class _06_DecimalToBinary {
    public static void main(String[] args) {
        decimalToBin(20);
    }

    private static void decimalToBin(int num) {
        if (num == 0)
            return;
        decimalToBin(num / 2);
        System.out.print(num % 2);
    }
}
