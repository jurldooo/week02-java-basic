package day6.T07;

public class Cat extends Pet{
    public Cat(String name,int num){
        this.power=num;
        this.type=name;
    }

    @Override
    public void eat(int num) {
        power=power+num;
        System.out.println(type+" "+power);
    }

    public void catchMouse(){
        System.out.println("抓老鼠");
    }
}
