package day6.T07;

public class Dog extends Pet{
    public Dog(String name,int num){
        this.power=num;
        this.type=name;
    }

    @Override
    public void eat(int num) {
        power=power+num;
        System.out.println(type+" "+power);
    }

    public void seedoor(){
        System.out.println("看门");
    }
}
