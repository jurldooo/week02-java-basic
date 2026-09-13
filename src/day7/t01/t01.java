package day7.t01;

public class t01 {
    public static void main(String[] args) {
         Fish[] fishes={new Golsfish("金鱼"),new Shark("鲨鱼")};
         for(Fish fish:fishes){
             fish.eat();
             fish.swim();
             if(fish instanceof Shark){
                 Shark shark=(Shark)fish;
                 shark.power();
             }
             fish.show();
         }
    }
}
