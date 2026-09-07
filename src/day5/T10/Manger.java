package day5.T10;

public class Manger {
    double saving;
    public void mangerinit(){
        saving=10000;
    }
    public void addmoney(double money){
        saving=saving+money;
        System.out.println("当前余额为:"+saving);
    }
    public void withdrew(double number){
        if(saving>=number) {
            saving = saving - number;
            System.out.println("当前余额:"+saving);
        }
        else{
            System.out.println("余额不足");
        }
    }
}
