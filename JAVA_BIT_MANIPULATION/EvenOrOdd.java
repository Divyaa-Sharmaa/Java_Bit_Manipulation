package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean isEvenOrOdd = checkIfEvenOrOdd(x);
        if (isEvenOrOdd) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        sc.close();
    }

    public static boolean checkIfEvenOrOdd(int x) {
        int bitmask = 1;
        if ((x & bitmask) == 1) {
            return false;
        }
        return true;
    }
}
