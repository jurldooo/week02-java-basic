package day11.t08;

import java.io.*;
import java.util.ArrayList;

public class T08 {
    public static void main(String[] args) {
        ArrayList<Book> list=new ArrayList<>();
        Book b1=new Book("阿泰勒的角落",60,"李娟");
        Book b2=new Book("你是人间的四月天",70,"林徽因");
        list.add(b1);
        list.add(b2);
        FileOutputStream fos=null;
        ObjectOutputStream oos=null;
        try {
            fos=new FileOutputStream("E:\\java\\练习\\book.bin");
            oos=new ObjectOutputStream(fos);
            oos.writeObject(list);
            System.out.println("序列化成功");
        } catch (FileNotFoundException e) {
            System.out.println("文件不存在");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fos.close();
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
