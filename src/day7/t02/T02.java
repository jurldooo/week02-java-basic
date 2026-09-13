package day7.t02;
import java.util.Scanner;
public class T02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String shape=sc.next();
        double area=0;
        double volumn=0;
        if(shape.equals("矩形")){
            Cylinder jx=new Cylinder("矩形");
            jx.show();
            System.out.println("请输入矩形的长和宽");
            double chang=sc.nextDouble();
            double kuan=sc.nextDouble();
            area=jx.area(chang,kuan);
            System.out.println("请输入矩形的高");
            double gao=sc.nextDouble();
            volumn=jx.volumn(chang,kuan,gao);
        }
        else if(shape.equals("圆")){
            Cylinder y=new Cylinder("圆");
            y.show();
            System.out.println("请输入圆的半径");
            double r=sc.nextDouble();
            area=y.area(r);
            volumn=y.volumn(r);
        }
        System.out.printf("%s的面积为:%.2f",shape,area);
        System.out.printf("体积为：%.2f",volumn);
    }
}
