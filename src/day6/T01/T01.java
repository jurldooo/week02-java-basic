package day6.T01;

public class T01 {
    public static void main(String[] args) {
        Car car=new Car("奥迪","a6",2007);
        car.setMile(3000);
        int miles=car.getMile();
        System.out.println(miles);
    }
}
