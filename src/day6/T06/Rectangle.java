package day6.T06;

public class Rectangle extends Shape{
    double chang;
    double kuan;
    double area;
    public Rectangle(double chang,double kuan){
        this.chang=chang;
        this.kuan=kuan;

    }
    @Override
    public void area() {
        area=chang*kuan;
    }

    @Override
    public void showArea() {
        System.out.printf("矩%.2f",area);
    }
}
