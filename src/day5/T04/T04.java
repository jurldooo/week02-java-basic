package day5.T04;
import java.util.Scanner;
public class T04 {
    public static void main(String[] args) {
        Repeating3 ep=new Repeating3();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入sequence:");
        String sequence=sc.next();
        System.out.println("请输入word");
        String word=sc.next();

        int result=ep.maxReapting(sequence,word);
        System.out.println(result);
    }
}
