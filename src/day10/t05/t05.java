package day10.t05;

import java.util.Scanner;

public class t05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str= sc.next();
        int count1=0,count2=0,count3=0;
        for(char item:str.toCharArray()){
            if(item>='A'&&item<='Z'){
                count1++;
            }
            else if(item>='a'&&item<='z'){
                count2++;
            }
            else if(item>='0'&&item<='9'){
                count3++;
            }
        }
        System.out.println(count1);
        System.out.println(count2);
        System.out.println(count3);
    }
}
