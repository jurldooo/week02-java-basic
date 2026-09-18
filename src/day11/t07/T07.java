package day11.t07;

import java.io.*;

public class T07 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        DataInputStream dis=null;
        DataOutputStream dos=null;
        try {
            fis=new FileInputStream("E:\\java\\练习\\practice.png");
            dis=new DataInputStream(fis);
            fos=new FileOutputStream("E:\\java\\练习\\t07.png");
            dos=new DataOutputStream(fos);
            byte[] bytes=new byte[1024];
            int len;
            while((len=dis.read(bytes))!=-1){
                dos.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                fos.close();
                dis.close();
                dos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
