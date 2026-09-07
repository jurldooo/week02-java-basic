package day5.T02;
import java.util.Scanner;
import java.util.Arrays;
public class T02 {
    public static void main(String[] args) {
        Movie mv=new Movie();
        mv.name="2026";
        mv.actor="jurld";
        String[] act=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入演员名");
        for(int i=0;i<act.length;i++){
            act[i]=sc.next();
        }
        mv.actress=act;
        System.out.println(Arrays.toString(mv.actress));
    }

}
