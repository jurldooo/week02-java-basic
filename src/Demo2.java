import java.util.Scanner;
public class Demo2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        int score=sc.nextInt();
        switch(score) {
            case 1:
                System.out.println("可乐");
                break;
            case 2:
                System.out.println("雪碧");
                break;
            case 3:
                System.out.println("咖啡");
                break;
            default:
                System.out.println("无效选择");
        }
        switch(score){
            case 1 ->System.out.println("周一");
            case 2 ->System.out.println("2");
            default -> System.out.println("0");
        }
        sc.close();


    }
}
