package day11.t06;

import java.io.*;

public class T06 {
    public static void main(String[] args) {
        FileReader fr=null;
        BufferedReader br=null;
        try {
            fr=new FileReader("E:\\java\\test.txt");
            br=new BufferedReader(fr);
            String words=br.readLine();
            while(words!=null){
                System.out.println(words);
                words=br.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
