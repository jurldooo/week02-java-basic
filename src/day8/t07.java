package day8;
import java.util.Scanner;
public class t07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        String[] str=new String[num];
        String str1= null;
        try{
            //str=null;
            //str[5]="hello";
            int a=str1.length();
        }catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
}
