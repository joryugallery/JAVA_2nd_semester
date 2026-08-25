package ai0825;

import java.util.Scanner;

public class skate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] Score = new int[5];
        int sum =0;
        double avg;

        System.out.println("경기종료");

        for (int i =0; i<Score.length;i++){
            System.out.println("심사위원" + (i+1) + "점수입력");
            sum += Score[i];
        }

        avg = (double)sum/ Score.length;

        System.out.println("심사위원 입력점수 : ");
        for (int i =0; i<Score.length;i++){
            System.out.printf("심사위원 %d: %d점", (i+1), Score[i]);
        }
        System.out.println("합계 : " + sum);
        System.out.printf("평균점수 : %.2f", avg );

































        sc.close();
    }
}
