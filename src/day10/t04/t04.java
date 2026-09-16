package day10.t04;

import java.text.SimpleDateFormat;
import java.util.Date;

public class t04 {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formate=sdf.format(date);
        System.out.println(formate);
    }
}
