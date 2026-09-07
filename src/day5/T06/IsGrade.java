package day5.T06;

public class IsGrade {
    String name;
    private int grade;

    public boolean setGrade(int grade) {
        if(grade>=60&&grade<=100){
            this.grade = grade;
            return true;
        }
        else{
            return false;
        }
    }
}
