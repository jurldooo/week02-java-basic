package day8;



public class t04 {

    public static void calc() throws ArithmeticException,Exception{
        System.out.println(5/0);
    }

    public static void main(String[] args) {
        try {
            calc();
        }catch (Exception e){
            System.out.println("除数不能为0");
        }
    }
}
