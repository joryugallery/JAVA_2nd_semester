package ai0922;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterTEst1 {
    public static void main(String[] args) {
        try{
            FileWriter fw = new FileWriter("myData2.txt");
            Scanner sc = new Scanner(System.in);
            String line = "";

            while(true){
                line = sc.nextLine();
                fw.write(line + "\n");

                if (line.equals("exit")){
                    
                    fw.close();
                    break;
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
