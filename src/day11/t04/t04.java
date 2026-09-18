package day11.t04;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class t04 {
    public static void main(String[] args) {
        FileReader reader=null;
        StringBuilder sb=null;
        try {
            reader=new FileReader("E:\\java\\test.txt");
            char[] chars=new char[1024];
            int len=reader.read(chars);
            sb=new StringBuilder();
            while(len!=-1){
                sb.append(chars,0,len);
                len=reader.read(chars);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(sb.toString());
    }
}
