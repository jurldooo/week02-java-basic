package day5.T05;
import java.util.Scanner;
public class T05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] scores=new int[5];
        Avg avg=new Avg();
        for(int i=0;i<scores.length;i++){
            scores[i]=sc.nextInt();
        }
        double avgscore=avg.avgScore(scores);
        int maxscore=avg.maxScore(scores);
        System.out.println(avgscore+" "+maxscore);
    }
}
