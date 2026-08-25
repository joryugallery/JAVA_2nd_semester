package ai0825;

import java.util.Random;

public class myungun {
    public static void main(String[] args) {
        String[] myungun = {"명언1", "명언2", "명언3", "명언4", "명언5", "명언6", "명언7", "명언8", "명언9", "명언10"};


        Random random = new Random();
        int randomIndex = random.nextInt(10);
        System.out.println(myungun[randomIndex]);
    }
}
