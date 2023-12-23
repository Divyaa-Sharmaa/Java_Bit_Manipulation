package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

class isPowerOfTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean istrue = isPowOf2(n);
        System.out.println(istrue);
        sc.close();
        // System.out.println("istrue: " + isPowOf2(n));
    }

    public static boolean isPowOf2(int n) {
        return (n & (n - 1)) == 0;
    }
}