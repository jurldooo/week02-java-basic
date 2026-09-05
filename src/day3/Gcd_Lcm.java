package day3;
import java.util.Scanner;
public class Gcd_Lcm {
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     if(a<1 || a>12){
         System.out.println("范围错误");
         return;
     }

     switch (a) {
                case 1 -> System.out.println("一月");
                case 2 -> System.out.println("二月");
                case 3 -> System.out.println("三月");
                case 4 -> System.out.println("四月");
                case 5 -> System.out.println("五月");
                case 6 -> System.out.println("六月");
                case 7 -> System.out.println("七月");
                case 8 -> System.out.println("八月");
                case 9 -> System.out.println("九月");
                case 10 -> System.out.println("十月");
                case 11 -> System.out.println("十一月");
                case 12 -> System.out.println("十二月");

            }
        }


}
