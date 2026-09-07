package day5.T04;
import java.util.Arrays;
public class Repeating {
    public int maxReapting(String sequence,String word){
        if(sequence==null||word==null||word.isEmpty()||sequence.isEmpty()){
            System.out.println("参数错误");
            return 0;
        }
        if(sequence.length()<word.length()){
            System.out.println("长度错误");
            return 0;
        }
        int k=0;
        char[] char1=new char[sequence.length()];
        char[] char2=new char[word.length()];
        char1=sequence.toCharArray();
        char2=word.toCharArray();
        int count=word.length();
        for(int i=0;i<sequence.length();){
            int n=0;
            //对比
            if(char1[i]==char2[0]){
                int m=i;
                for(int j=0;j<count;j++){
                    if(m>=sequence.length()||char1[m]!=char2[j]){
                        break;
                    }
                    else{
                        m++;
                        n++;
                    }
                }

            }
            //判断是否满足长度
            if(n==count){
                k++;
                //(连续重复)i=i+count;
            }
            //else{
                i++;
            //}
        }
        return k;

    }
}
