package ai0922;

import java.io.*;

public class FileCopy {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("myData2.txt"));

            FileWriter fw = new FileWriter("newFile.txt");

            String line = "";

            while (true) {
                line = br.readLine();
                if (line == null) {
                    break;
                }
            }

            br.close();
            fw.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}