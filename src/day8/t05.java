package day8;

public class t05 {
    public static void devide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("除数不能为0");
        }
        int result=a/b;
        System.out.println(result);
    }
    public static void main(String[] args) {
        try {
            devide(3,0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
