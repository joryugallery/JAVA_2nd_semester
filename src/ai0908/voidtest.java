package ai0908;

import java.util.Scanner;

public class voidtest {

    public static void printLine(char c, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(c);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = new char[7];
        int[] counts = new int[7];

        for (int i = 0; i < chars.length; i++) {
            System.out.print((i + 1) + "번째 문자");
            chars[i] = sc.next().charAt(0);

            System.out.print((i + 1) + "번째 숫자");
            counts[i] = sc.nextInt();
        }

        for (int i = 0; i < chars.length; i++) {
            printLine(chars[i], counts[i]);
        }

        sc.close();
    }
}