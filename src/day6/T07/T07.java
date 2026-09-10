package day6.T07;

public class T07 {
    public static void main(String[] args) {
        Pet dog=new Dog("小黑",100);
        Pet cat=new Cat("小猫",100);
        Master master=new Master();
        master.feed(dog,20);
        master.feed(cat,30);
        master.work(dog);
        master.work(cat);
    }
}
