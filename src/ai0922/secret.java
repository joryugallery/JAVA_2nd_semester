package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class secret {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String line = "";
        String secure = "";
        FileWriter fw = null;
        try {
            fw = new FileWriter("secure.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        while (true) {
            System.out.println("스파이에게 전달할 메세지");
            line=sc.nextLine();
            if (line.equals(""))
                break;


            for (int i=0;i<line.length();i++) {
                int num = (int)line.charAt(i);
                num += 100;
                secure += (char)num;
            }

            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            sc.close();
            try {
                fw.write(secure + "\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
