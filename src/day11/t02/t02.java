package day11.t02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class t02 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            byte[] bytes=new byte[1024];
            fis=new FileInputStream("E:\\java\\test.txt");
            while((fis.available())!=0){
                int date=fis.read(bytes);
                String temp=new String(bytes,0,date);
                System.out.println(temp);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
