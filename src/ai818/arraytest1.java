package ai818;

import java.util.Scanner;

public class arraytest1 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int[] numArr = new int[5];
        int sum = 0;


        for (int i =0; i < numArr.length; i++){
            System.out.printf("* (%d) 정수입력:", i+1);
            numArr[i] = s1.nextInt();
            sum += numArr[i];
        }

        for (int i =0; i < numArr.length; i++){
            if(i<4){
                System.out.println(numArr[i] + " + ");
            }
            else{
                System.out.println(numArr[i] + " = ");
                System.out.println(sum);
            }
        }

        s1.close();
    }
}
