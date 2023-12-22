package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class GetIthBitt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt();
        int result = getIthBit(n, i);
        System.out.println("Ith bit is: " + result);
        System.out.println("setIth Bit is: " + (n | (1 << i)));
        sc.close();
    }

    public static int getIthBit(int n, int i) {
        int bitMask = 1 << i;
        if ((n & bitMask) == 0)
            return 0;
        return 1;
    }
}
