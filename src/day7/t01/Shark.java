package day7.t01;

public class Shark extends Fish implements Eat, Swim, Power {
    public Shark(){

    }
    public Shark(String type){
        super.type=type;
    }

    @Override
    public void show() {
        System.out.println("我是"+type);
    }

    @Override
    public void eat() {
        System.out.println("鲨鱼吃小鱼");
    }

    @Override
    public void power() {
        System.out.println("电感应");
    }

    @Override
    public void swim() {
        System.out.println("鲨鱼游泳");
    }
}
