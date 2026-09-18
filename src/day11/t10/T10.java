package day11.t10;

import java.io.*;

public class T10 {
    public static void main(String[] args) {
        FileReader fr=null;
        FileWriter fw=null;
        try {
            fr=new FileReader("E:\\java\\myInputfile.txt");
            fw=new FileWriter("E:\\java\\test.txt");
            char[] chars=new char[1024];
            int len;
            while((len=fr.read(chars))!=-1){
                fw.write(chars);
            }
            fw.flush();
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
