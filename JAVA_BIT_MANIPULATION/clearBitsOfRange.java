package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class clearBitsOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(clearBitOfRange(n, i, j));
        sc.close();
    }

    public static int clearBitOfRange(int n, int i, int j) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }
}
