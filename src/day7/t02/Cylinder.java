package day7.t02;

public  class Cylinder implements Shape{
    String shape;
    public Cylinder(){

    }
    public Cylinder(String type){
        shape=type;
    }
    public void show(){
        System.out.println("我是"+shape);
    }

    @Override
    public double area(double num1, double num2) {
        return num1*num2;
    }

    @Override
    public double area(double num1) {
        return 3.14*num1*num1;
    }

    @Override
    public double volumn(double num1, double num2, double num3) {
        return num1*num2*num3;
    }

    @Override
    public double volumn(double num1) {
        return (4.0/3)*num1*num1*num1;
    }
}
