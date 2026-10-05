package ai0929.exception;

import java.io.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsTest {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myData1.txt"));
            
            while (true){
                String line = br.readLine();
                if(line == null) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("파일을 찾을 수 없습니다.");
        } catch (IOException e) {
            System.out.println("한 줄 읽어 올 때 문제가 발생했습니다.");
        }
    } 
    
}
