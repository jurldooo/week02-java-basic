package day8;

public class t08 {
    public static void exception(int a,int b,int c){
        if(b==0){
            throw new ArithmeticException("算术异常");
        }
        if(c<=0){
            throw new NullPointerException("空指针异常");
        }
    }
    public static void main(String[] args) {
        int a=1;
        int b=2;
        int c=0;
        try{
            exception(a,b,c);
        }catch (ArithmeticException ex){
            System.out.println(ex.getMessage());
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
    }
}
