package day6.T02;
import java.util.Scanner;
public class T02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("请输入数组");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        maxSubArray ms=new maxSubArray();
        int maxhe=ms.max(nums);
        System.out.println();
        System.out.println(maxhe);
    }


}
