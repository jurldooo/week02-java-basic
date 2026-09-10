package day6.T09;
import java.util.Scanner;
public class T09 {
    public static void main(String[] args) {
        String type;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入dog,cat,pig");
        type=sc.next();
        grandpa g=new grandpa();
        Animal animal=g.chui(type);
        animal.Shape();
    }
}
