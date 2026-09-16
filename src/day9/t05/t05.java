package day9.t05;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class t05 {
    public static void main(String[] args) {
        HashMap<String,Book> map=new HashMap<>();
        Book b1=new Book("阿泰勒的角落",60,"李娟");
        Book b2=new Book("你是人间的四月天",70,"林徽因");
        Book b3= new Book("平凡的世界",80,"路遥");
        map.put("阿泰勒的角落",b1);
        map.put("你是人间的四月天",b2);
        map.put("平凡的世界",b3);
        Set<String> set=map.keySet();
        for(String s:set){
            System.out.println(s+" "+map.get(s).getAuthor());
        }
    }
}
