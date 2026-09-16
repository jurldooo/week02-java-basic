package day8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class t02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int num1= sc.nextInt();
            int num2= sc.nextInt();
            int result=0;
            result=num1/num2;
            System.out.println(result);
        }catch(InputMismatchException ex){
            System.out.println("被除数和除数都必须为整数");
        }catch(ArithmeticException ex) {
            System.out.println("被除数不能为0");
        }catch(Exception ex){
            System.out.println("未知异常");
        }finally {
            System.out.println("程序结束");
        }
    }
}
