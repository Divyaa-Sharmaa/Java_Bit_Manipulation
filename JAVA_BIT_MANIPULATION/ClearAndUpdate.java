package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class ClearAndUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(clearIthBit(x, i)); // 16
        sc.close();
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }
}
