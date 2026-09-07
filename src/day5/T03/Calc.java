package day5.T03;

public class Calc {
    public int calcData(int num1,int num2,char oper){
        int result;
        if(num2==0&&oper=='/'){
            System.out.println("参数错误");
            return 0;
        }
        switch(oper){
            case '+' ->result=num1+num2;
            case '-' ->result=num1-num2;
            case '*' ->result=num1*num2;
            case '/' ->result=num1/num2;
            default -> {
                System.out.println("运算符错误");
                return 0;
            }
        }

        return result;

    }
}
