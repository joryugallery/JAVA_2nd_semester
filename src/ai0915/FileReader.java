package ai0915;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {
     public static void main(String[] args) {
         try {
             BufferedReader br = new BufferedReader(new java.io.FileReader("/Users/joryugallery/Desktop/과제/영상인공지능처리/과제 5/영상인공지능처리 0422과제 2601110275 강민재.pdf"));

             String line = "";

             while (true){
                 line = br.readLine();
                 if (line==null){
                     break;
                 }
                 System.out.println(line);
             }

             line = br.readLine();
             System.out.println(line);
             line = br.readLine();
             System.out.println(line);
             line = br.readLine();
             System.out.println(line);

             br.close();

         } catch (FileNotFoundException e) {
             throw new RuntimeException(e);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }


     }
}
