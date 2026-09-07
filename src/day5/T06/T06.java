package day5.T06;
import java.util.Scanner;
public class T06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        int grade=sc.nextInt();
        IsGrade ig=new IsGrade();
        ig.name=name;
        boolean flag=ig.setGrade(grade);
        System.out.println(flag);
    }
}
