package day5.T09;
import java.util.Scanner;
public class T09 {
    public static int fun(int n){
        if(n==1){
            return 1;
        }
        else{
            return n*fun(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int result=fun(num);
        System.out.println(result);
    }
}
