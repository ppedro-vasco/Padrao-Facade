package Facade;

public class Aspirante {
    public boolean progredir(){
        return AspiranteFacade.verificarAptidaoProgressao(this);
    }
}
