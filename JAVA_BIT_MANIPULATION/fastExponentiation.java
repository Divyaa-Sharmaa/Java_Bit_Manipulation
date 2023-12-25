package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class fastExponentiation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println("result is: " + fastExpo(n, a));
        sc.close();
    }

    public static int fastExpo(int a, int n) {
        if (n == 0)
            return 1;
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) { // check LSB
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }
}