package day6.T01;

public class Car {
    String brand;
    String type;
    int year;
    int mile;

    public Car(String brand,String type,int year){

    }
    public void setMile(int mile) {
        if(mile<0){
            System.out.println("数据错误");
        }
        else{
            this.mile = mile;
        }
    }

    public int getMile() {
        return mile;
    }
}
