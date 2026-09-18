package day11.t01;

import java.io.File;
import java.io.IOException;

public class t01 {
    public static void main(String[] args) {
        File file=new File("E:/java/test1.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println("创建成功");
        }else{
            System.out.println("已存在");
        }
    }
}
