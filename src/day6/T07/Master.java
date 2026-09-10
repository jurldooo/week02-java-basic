package day6.T07;

public class Master {
    public void feed(Pet pet,int num){
        pet.eat(num);
    }

    public void work(Pet pet){
        if(pet instanceof Dog){
            Dog dog=(Dog)pet;
            dog.seedoor();
        }
        else if(pet instanceof Cat){
            Cat cat=(Cat)pet;
            cat.catchMouse();
        }
    }
}
