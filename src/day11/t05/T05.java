package day11.t05;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class T05 {
    public static void main(String[] args) {
        Writer writer=null;
        try {
            writer=new FileWriter("E:\\java\\test.txt");
            String word="你好t05测试";
            writer.write(word);
            writer.flush();
            System.out.println("写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
