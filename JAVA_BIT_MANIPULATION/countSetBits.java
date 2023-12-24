package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class countSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("number of Set bits: " + countSetBitsInNum(n));
        sc.close();
    }

    public static int countSetBitsInNum(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
}
