package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class ClearAndUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = sc.nextInt();
        // int newBit = sc.nextInt();
        // System.out.println(clearIthBit(x, i));
        // System.out.println(updateIthBit(x, i, newBit));
        System.out.println(clearLastBit(x, i));
        sc.close();
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if (newBit == 0)
            return clearIthBit(n, i); // return (n & (~(1<<i)));
        else
            return (n | (1 << i));
        // or we can do it by another trick as follow:
        // n = clearIthBit(n, i);
        // int bitMask = newBit << i;
        // return (n | bitMask);
    }

    public static int clearLastBit(int n, int i) {
        int bitMask = (~0) << i;
        return n & bitMask;
    }
}
