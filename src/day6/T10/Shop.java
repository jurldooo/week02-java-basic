package day6.T10;

public class Shop {
    public Cake order(String type){
        Cake cake;
        if (type.equals("慕斯")){
            cake=new msCake();
        }
        else if(type.equals("泡芙")){
            cake=new pfCake();
        }
        else{
            cake=new hslCake();
        }
        return cake;
    }
}
