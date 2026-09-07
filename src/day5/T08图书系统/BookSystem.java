package day5.T08图书系统;
import java.util.Scanner;

public class BookSystem {
    public static void menu(){
        System.out.println("欢迎来到图书管理系统");
        System.out.println("0、退出系统");
        System.out.println("1、图书列表");
        System.out.println("2、添加图书");
        System.out.println("请输入对应操作");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        BookManger manger=new BookManger();
        manger.bookinit();
        menu();
        num=sc.nextInt();
        while(num!=0) {
            if (num == 1) {
                System.out.println("这里是图书列表");
                System.out.println("书名" + "\t\t\t\t" + "作者" + "\t\t" + "价格");
                manger.bookList();
                menu();
                num = sc.nextInt();
            } else if (num == 2) {
                boolean userflag=false;
                Book userbook = new Book();
                System.out.println("这里是添加图书界面");
                System.out.println("请输入图书名称");
                userbook.bookname = sc.next();
                System.out.println("请输入图书作者");
                userbook.author = sc.next();
                System.out.println("请输入图书价格");
                userbook.price = sc.nextDouble();
                userflag=manger.bookadd(userbook);
                if(userflag==true){
                    System.out.println("添加成功");
                }
                else {
                    System.out.println("添加失败");
                }
                menu();
                num = sc.nextInt();
            }
        }
        if(num==0){
            System.out.println("系统已退出");
        }
    }
}
