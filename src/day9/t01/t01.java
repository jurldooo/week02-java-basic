package day9.t01;

import java.util.ArrayList;

public class t01 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add(2);
        list.add("hello");
        list.add(1,1.1);
        list.remove("hello");
        list.remove(1);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
