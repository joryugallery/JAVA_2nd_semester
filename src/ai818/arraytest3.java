package ai818;

import java.util.Arrays;

public class arraytest3 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};

        arr1 = Arrays.copyOf(arr1,arr1.length + 2);

        System.out.println("추가된 배열의 길이 : " + arr1.length);

//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i] + " ");
//        }

        for (int data : arr1){
            System.out.println(data + " ");
        }


    }
}
