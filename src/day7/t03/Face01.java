package day7.t03;

public interface Face01 {
    public abstract String getName();
    default int getNum(){
        return 10;
    }
}
