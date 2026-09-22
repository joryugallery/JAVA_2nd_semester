package ai0922;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class imagefilecopy {
    public static void main(String[] args) {
        try {
            FileInputStream fIn = new FileInputStream("fire.jpg");
            FileOutputStream fOut = new FileOutputStream("firecopy.jpg");

            int data;
            while((data = fIn.read()) != -1){
                fOut.write((byte)data);
            }

            System.out.println("이미지 복사 완료");

            fIn.close();
            fOut.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
