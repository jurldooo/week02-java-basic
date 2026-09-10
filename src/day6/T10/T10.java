package day6.T10;
import java.util.Scanner;
public class T10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String type;
        System.out.println("请输入慕斯，泡芙，红丝绒");
        type=sc.next();
        Shop shop=new Shop();
        Cake cake=shop.order(type);
        cake.make();
    }
}
