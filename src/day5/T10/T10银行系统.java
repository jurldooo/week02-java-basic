package day5.T10;
import java.util.Scanner;

public class T10银行系统 {
    public static void menu(){
        System.out.println("1、存款 2、取款 0、退出");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        double usermoney,usernumber;
        Manger mg=new Manger();
        mg.mangerinit();
        menu();
        num=sc.nextInt();
        while(num!=0){
            if(num==1){
                System.out.println("请输入存款金额:");
                usermoney=sc.nextDouble();
                mg.addmoney(usermoney);
                menu();
                num= sc.nextInt();
            }
            else if(num==2){
                System.out.println("请输入取款金额:");
                usernumber=sc.nextDouble();
                mg.withdrew(usernumber);
                menu();
                num= sc.nextInt();
            }
        }
        if(num==0){
            System.out.println("退出系统");
        }
    }
}
