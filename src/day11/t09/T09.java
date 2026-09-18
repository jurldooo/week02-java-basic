package day11.t09;

import day11.t08.Book;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class T09 {
    public static void main(String[] args) {
        FileInputStream fis=null;
        ObjectInputStream ois=null;
        try {
            fis=new FileInputStream("E:\\java\\练习\\book.bin");
            ois=new ObjectInputStream(fis);
            ArrayList<Book> list=(ArrayList<Book>) ois.readObject();
            for(Book item:list){
                System.out.println(item.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally {
            try {
                ois.close();
                fis.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
