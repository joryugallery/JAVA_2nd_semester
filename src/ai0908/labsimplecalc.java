package ai0908;

import java.util.Scanner;


public class labsimplecalc {
    public static int calc(int n1, int n2, String operator) {
        int result = 0;

        switch (operator) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;

        }

        return result;

    }

    public static void main(String[] args) {



        while (true) {
            Scanner s = new Scanner(System.in);
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            String operator = s.next();
            if (operator.equals("end")) {
                s.close();
                return;
            }



            System.out.printf("%d %s %d = %d%n", n1, operator, n2, calc(n1, n2, operator));
        }


    }
}
