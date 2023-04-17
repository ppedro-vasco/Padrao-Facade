package Facade;

public class CavaleiroJedi extends Progressao{
    private static CavaleiroJedi cavaleiroJedi = new CavaleiroJedi();
    private CavaleiroJedi() {};
    public static CavaleiroJedi getInstance(){
        return cavaleiroJedi;
    }
}
