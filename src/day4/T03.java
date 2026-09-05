package day4;
import  java.util.Scanner;
import  java.util.Random;
import java.util.Arrays;
public class T03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random rm=new Random();
        int n=sc.nextInt();
        char char1=sc.next().charAt(0);
        char char2=sc.next().charAt(0);
        char array[]=new char[n+2];
        array[0]=char1;
        array[n+1]=char2;
        for (int i=1;i<n+1;i++){
            array[i]=(char)(rm.nextInt(26)+'a');
        }
        System.out.println(Arrays.toString(array));
    }
}
