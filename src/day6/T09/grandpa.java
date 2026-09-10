package day6.T09;

public class grandpa {
    public Animal chui(String type){
        Animal animal;
        if(type.equals("dog")){
            animal=new Dog();
        }
        else if(type.equals("cat")){
            animal =new Cat();
        }
        else{
            animal=new Pig();
        }
        return animal;
    }
}
