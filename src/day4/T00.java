package day4;
import java.util.Arrays;
public class T00 {
    public static void main(String[] args) {
        int array1[]= new int[]{1, 4, 6, 2, 3};
        int array2[]= new int[]{7, 4, 59, 8, 5};
        int array3[]= new int[]{5, 3, 8, 1, 9};
        int array4[]= new int[5];
        Arrays.fill(array4,10);
        System.out.println(Arrays.toString(array4));
        //int[] c=new int[5];
        int[] c=Arrays.copyOf(array1,3);
        System.out.println(Arrays.toString(c));
        Arrays.sort(array1);
        System.out.println(Arrays.binarySearch(array1,4));
    }
}
