package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

class Bit_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // 1. Binary AND (&)
        System.out.println(x + "&" + y + "= " + (x & y));
        // Binary Or (|)
        System.out.println(x + "|" + y + "= " + (x | y));
        // XOR Operator ^
        System.out.println(x + "^" + y + "= " + (x ^ y));
        // Binary 1's compliment
        System.out.println("~" + x + "= " + ~x);
        // Right shift >>
        System.out.println(x + ">>" + y + "= " + (x >> y));
        // Left Shift <<
        System.out.println(x + "<<" + y + "= " + (x << y));

        sc.close();
    }

}
