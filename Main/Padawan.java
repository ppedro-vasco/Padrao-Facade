package Facade;

public class Padawan extends Progressao{
    private static Padawan padawan = new Padawan();
    private Padawan() {};
    public static Padawan getInstance(){
        return padawan;
    }
}
