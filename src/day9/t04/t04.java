package day9.t04;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class t04 {
    public static void main(String[] args) {
        HashSet<Book> set=new HashSet<>();
        Book b1=new Book("阿泰勒的角落",60,"李娟");
        Book b2=new Book("你是人间的四月天",70,"林徽因");
        Book b3= new Book("平凡的世界",80,"路遥");
        Book b=b1;
        set.add(b);
        set.add(b1);
        set.add(b2);
        set.add(b3);
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
