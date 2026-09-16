package day9.StudentManger;

import java.util.ArrayList;

public class StudentManger {
    ArrayList<Student> list=new ArrayList<>();
    public boolean add(Student stu){
        return list.add(stu);
    }
    public void show(){
        System.out.println("姓名"+"\t"+"学号"+"\t"+"年龄");
        for(Student l:list){

            System.out.println(l.getName()+"\t"+l.getId()+"\t"+l.getAge());
        }
    }
}
