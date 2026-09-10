package day6.T08;

public class T08 {
    public static void main(String[] args) {
        Chinese chinese=new Chinese();
        American american=new American();
        Korea korea=new Korea();
        Person[] person=new Person[3];
        person[0]=chinese;
        person[1]=american;
        person[2]=korea;
        for(Person p:person){
            p.sayHi();
        }

    }
}
