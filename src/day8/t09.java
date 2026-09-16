package day8;

class My extends Exception{
    public My(String msg){
        super(msg);
    }
}
public class t09 {
    public static void main(String[] args) {
        try {
            throw new My("手动抛出异常");
        }catch (My ex){
            System.out.println(ex.getMessage());
        }
    }
}
