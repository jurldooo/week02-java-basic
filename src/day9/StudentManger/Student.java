package day9.StudentManger;

public class Student {
    private String name;
    private String id;
    private int age;
    public Student(){

    }
    public Student(String name,String id,int age){
        this.age=age;
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getId() {
        return id;
    }
}
