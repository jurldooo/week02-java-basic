package day4;
import java.util.Arrays;
import java.util.Random;
public class T02 {
    public static void main(String[] args) {
        int array[][]=new int[3][4];
        Random rm=new Random();
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                array[i][j]=rm.nextInt(100)+1;
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }

    }
}
