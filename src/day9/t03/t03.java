package day9.t03;


import java.util.Iterator;
import java.util.LinkedList;

public class t03 {
    public static void main(String[] args) {
        LinkedList<Book> list=new LinkedList<>();
        Book b1=new Book("阿泰勒的角落",60,"李娟");
        Book b2=new Book("你是人间的四月天",70,"林徽因");
        Book b3= new Book("平凡的世界",80,"路遥");
        list.add(b1);
        list.add(b2);
        list.addFirst(b3);
        for(Book book:list) {
            System.out.println(book.toString());
        }
        Iterator<Book> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
