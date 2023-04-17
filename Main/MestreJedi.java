package Facade;

public class MestreJedi extends Progressao {
    private static MestreJedi mestreJedi = new MestreJedi();

    private MestreJedi() {
    };
    public static MestreJedi getInstance() {
        return mestreJedi;
    }
}