package day5.T04;
//重复
public class Repeating3 {
    public int maxReapting(String sequence, String word){
        if (sequence == null || word == null || word.isEmpty()) {
            return 0;
        }
        int count=0;
        //创造一个容器
        StringBuilder str=new StringBuilder();
        while(true){
            str=str.append(word);//第一次：ab；第二次：abab；第三次：ababab
            if(sequence.contains(str.toString())){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
