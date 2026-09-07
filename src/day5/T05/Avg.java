package day5.T05;

public class Avg {
    public double avgScore(int[] scores){
        double total=0;
        for(int i=0;i<scores.length;i++){
            total=total+scores[i];
        }
        double result=total/scores.length;
        return result;
    }
    public int maxScore(int[] scores){
        int max=scores[0];
        for(int j=1;j<scores.length;j++){
            if(max<scores[j]){
                max=scores[j];
            }
        }
        return max;
    }
}
