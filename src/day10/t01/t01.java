package day10.t01;

public class t01 {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="张安";
        student.sex=Gender.FEMALE;
        System.out.println(student.sex+student.name);
    }
}
