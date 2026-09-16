package day9.t02;

import java.util.ArrayList;
import java.util.List;

public class t02 {
    public static void main(String[] args) {
            List list=new ArrayList();
            Book b1=new Book("阿泰勒的角落",60,"李娟");
            Book b2=new Book("你是人间的四月天",70,"林徽因");
            list.add(b1);
            list.add(b2);
            Book b3=new Book("平凡的世界",80,"路遥");
            list.add(1,b3);
            boolean flag=list.contains(b1);
        System.out.println(flag);
            for(int i=0;i<list.size();i++){
                Book b=(Book)list.get(i);
                System.out.println(b);
            }
    }
}
