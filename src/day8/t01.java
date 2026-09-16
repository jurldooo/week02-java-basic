package day8;
import java.util.Scanner;
public class t01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int result=0;
        try {
            result=num1/num2;
            System.out.println(result);
        }catch (Exception ex){
            System.err.println("除数不能为0");
            ex.printStackTrace();
            String str=ex.getMessage();
            System.out.println(str);
            return;
        }
        finally {
            System.out.println("程序结束");
        }
    }
}
