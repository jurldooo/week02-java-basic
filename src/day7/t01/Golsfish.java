package day7.t01;

public class Golsfish extends Fish implements Eat, Swim {
    public Golsfish(){

    }
    public Golsfish(String type){
        super.type=type;
    }
    @Override
    public void show() {
        System.out.println("我是"+type);
    }

    @Override
    public void eat() {
        System.out.println("金鱼吃东西");
    }

    @Override
    public void swim() {
        System.out.println("金鱼游泳");
    }
}
