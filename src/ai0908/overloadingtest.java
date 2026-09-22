package ai0908;

import java.util.Scanner;

public class overloadingtest {
    public static int calc(int n1, int n2, int n3, int operator) {
        int result = 0;

        switch (operator) {
            case '+': result = n1 + n2 + n3;
            break;
            case '-': result = n1 - n2 - n3;
            break;
            case '*': result = n1 * n2 * n3;
            break;
            case '/': result = n1 / n2 / n3;
            break;
        }

        return result;
    }

    public static int calc(int n1, int n2, char operator) {
        int result = 0;

        switch (operator) {
            case '+': result = n1 + n2 ;
                break;
            case '-': result = n1 - n2 ;
                break;
            case '*': result = n1 * n2 ;
                break;
            case '/': result = n1 / n2 ;
                break;
        }

        return result;
    }

    public static void main(String[] args) {

        int n1 = 3;
        int n2 = 5;
        int n3 = 7;
        char operator = '+' ;



        System.out.printf("%d %c %d = %d\n", n1, operator, n2, calc(n1, n2, operator));

        operator = '*' ;

        System.out.printf("%d %c %d %c %d = %d\n", n1 ,operator, n2,operator, n3, calc(n1, n2, n3, operator));


    }
}
