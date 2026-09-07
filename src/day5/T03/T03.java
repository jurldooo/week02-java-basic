package day5.T03;
import  java.util.Scanner;
public class T03 {
    public static void main(String[] args) {
        int a,b;
        char c;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.next().charAt(0);
        Calc calc1=new Calc();
        int result=calc1.calcData(a,b,c);
        System.out.println(result);
    }

}
