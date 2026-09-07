package day5.T01;
import java.util.Scanner;
public class T01 {


    public static void main(String[] args) {
        Login_System[] user=new Login_System[50];
        Login_System user1=new Login_System();
        user1.name="jurld";
        user1.password="666666";
        user[0]=user1;
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入用户名");
        String usename=sc.next();
        System.out.println("请输入密码");
        String usepassword=sc.next();
        boolean flag=false;
        for(int i=0;i<user.length;i++){
            if(user[i]!=null && user[i].name.equals(usename) && user[i].password.equals(usepassword)){
                flag=true;
                break;
            }
        }
        if(flag==true){
            System.out.println("登录成功");
        }else{
            System.out.println("登录失败");
        }
    }
}
