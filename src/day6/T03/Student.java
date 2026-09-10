package day6.T03;

public class Student extends Person{
    String sdept;
    public Student(String name,String ssex,int age,String sdept){
        super(name,ssex,age);
        this.sdept=sdept;

    }
    public void show(){
        System.out.println(super.name+super.age+super.ssex+sdept);
    }
}
