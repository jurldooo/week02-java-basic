package day4;
import java.util.Arrays;
import java.util.Random;
public class T01 {
    public static void main(String[] args) {
        int array1[]=new int[10];
        Random rm=new Random();
        for(int i=0;i<10;i++){
            array1[i]=rm.nextInt(100)+1;
        }
        System.out.println(Arrays.toString(array1));
        for(int j=array1.length-1;j>=0;j--){
            System.out.print(array1[j]+" ");
        }
        System.out.println();
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
    }
}
