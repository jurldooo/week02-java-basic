package day9.StudentManger;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManger manger=new StudentManger();
        Scanner sc=new Scanner(System.in);
        String str="y";
        while(str.equals("y")){
            System.out.println("请输入学生姓名");
            String stuname=sc.next();
            System.out.println("请输入学生学号");
            String stuid=sc.next();
            System.out.println("请输入学生年龄");
            int stuage=sc.nextInt();
            Student stu=new Student(stuname,stuid,stuage);
            manger.add(stu);
            System.out.println("是否继续y/n");
            str=sc.next();
        }
        manger.show();
    }
}
