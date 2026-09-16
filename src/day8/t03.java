package day8;
import java.util.InputMismatchException;
import java.util.Scanner;
public class t03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        try {
            int num= sc.nextInt();
            switch(num){
                case 1 -> System.out.println("星期一");
                case 2 -> System.out.println("星期er");
                case 3 -> System.out.println("星期three");
                case 4 -> System.out.println("星期four");
                case 5 -> System.out.println("星期five");
                case 6 -> System.out.println("星期six");
                case 7 -> System.out.println("星期seven");
                default -> System.out.println("误匹配数据");
            }
        }catch (InputMismatchException ex){
            System.out.println("您输入的不是数字");
        }catch(Exception e){
            System.out.println("未知异常");
        }finally {
            System.out.println("程序结束");
        }
    }
}
