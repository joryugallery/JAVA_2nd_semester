package ai0825;

import java.util.Arrays;
import java.util.Collections;

public class sortarray {
    public static void main(String[] args) {
        Integer[] numArr = {77,33,11,99,22};
        Arrays.sort(numArr, Collections.reverseOrder());
        for (int data : numArr){
            System.out.println(data + " ");
        }

        String[] nameArr = {"김유민", "도형준", "강석현", "유재화", "장영서"};
        Arrays.sort(nameArr, Collections.reverseOrder());
        for (String name : nameArr){
            System.out.println(name + " ");
        }
    }
}
