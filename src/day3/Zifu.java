package day3;
import java.util.Scanner;
//import java.io.IOException;
public class Zifu {
    public static void main(String[] args) //throws IOException
    {
        Scanner sc=new Scanner(System.in);
        String a=sc.nextLine();
        int count=0;
        count=a.length();
        //int inputChar;

//        while ((inputChar = System.in.read()) != -1) {
//           if (inputChar == '\n' || inputChar == '\r') {
//                continue;
//            }
//            count++;
//        }


        System.out.println(count);
    }
}
