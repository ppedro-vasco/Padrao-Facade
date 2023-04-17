package Facade;

import java.util.ArrayList;
import java.util.List;

public abstract class Progressao {
    private List<Aspirante> aspirantesAptos = new ArrayList<Aspirante>();

    public void addAspiranteApto(Aspirante aspirante){
        this.aspirantesAptos.add(aspirante);
    }

    public boolean verificarAspiranteApto(Aspirante aspirante){
        return this.aspirantesAptos.contains(aspirante);
    }
}
