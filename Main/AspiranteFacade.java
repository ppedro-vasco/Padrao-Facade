package Facade;

public class AspiranteFacade {
    public static boolean verificarAptidaoProgressao(Aspirante aspirante) {
        if (Youngling.getInstance().verificarAspiranteApto(aspirante)) {
            return true;
        }
        if (Padawan.getInstance().verificarAspiranteApto(aspirante)) {
            return true;
        }
        if (CavaleiroJedi.getInstance().verificarAspiranteApto(aspirante)) {
            return true;
        }
        if (MestreJedi.getInstance().verificarAspiranteApto(aspirante)) {
            return true;
        }
        return false;
    }
}
