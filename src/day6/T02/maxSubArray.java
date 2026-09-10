package day6.T02;

public class maxSubArray {

    public int max(int[] nums){
        int max=nums[0];
        int index_first=0;
        int index_last=0;
        for(int i=0;i<nums.length;i++){
            int sum=0;
            for(int j=i;j<nums.length;j++){

                sum=sum+nums[j];
                if(sum>max){
                    max=sum;
                    index_first=i;
                    index_last=j;
                }
            }
        }
        for(int k=index_first;k<=index_last;k++){
            System.out.print(nums[k]+" ");
        }
        return max;

    }
}
