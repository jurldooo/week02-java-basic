package day7.t03;

public class NameConflict implements Face01,Face02{
    @Override
    public String getName() {
        return "hel";
    }
    public int getNum(){
        return Face01.super.getNum();
    }

}
