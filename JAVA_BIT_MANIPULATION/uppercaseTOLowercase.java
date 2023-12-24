package JAVA_BIT_MANIPULATION;

import java.util.Scanner;

public class uppercaseTOLowercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println((char) (ch | ' '));
        }

        sc.close();
    }
}
