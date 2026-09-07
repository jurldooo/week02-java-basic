package day5.T04;

public class Repeating2 {
    public int maxReapting(String sequence, String word){
        if (sequence == null || word == null || word.isEmpty()) {
            return 0;
        }
        int count=0;
        String temp=sequence;
        while(temp.contains(word)){
            temp=temp.replaceFirst(word,"");
            count++;
        }
        return count;
    }
}
