package Facade;

public class Youngling extends Progressao{
    private static Youngling youngling = new Youngling();
    private Youngling() {};
    public static Youngling getInstance(){
        return youngling;
    }
}
