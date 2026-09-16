package day8;
import java.util.Scanner;
class AgeExpection extends Exception{
    public AgeExpection(String msg){
        super(msg);
    }
}
public class t06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age= sc.nextInt();
        String name= sc.next();

            try {
                if(age<0){
                    throw new AgeExpection("年龄不能为负数");
                }
                System.out.println(name+age);
            }catch (AgeExpection ex){
                System.out.println(ex.getMessage());
            }finally {
                System.out.println("over");
            }


    }
}
