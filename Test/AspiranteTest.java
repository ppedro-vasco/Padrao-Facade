package Facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AspiranteTest {
    @Test
    void deveRetornarAspiranteAptoYoungling() {
        Aspirante aspirante = new Aspirante();
        Youngling.getInstance().addAspiranteApto(aspirante);

        assertEquals(true, aspirante.progredir());
    }

    @Test
    void deveRetornarAspiranteAptoPadawan() {
        Aspirante aspirante = new Aspirante();
        Padawan.getInstance().addAspiranteApto(aspirante);

        assertEquals(true, aspirante.progredir());
    }

    @Test
    void deveRetornarAspiranteAptoCavaleiroJedi() {
        Aspirante aspirante = new Aspirante();
        CavaleiroJedi.getInstance().addAspiranteApto(aspirante);

        assertEquals(true, aspirante.progredir());
    }

    @Test
    void deveRetornarAspiranteAptoMestreJedi() {
        Aspirante aspirante = new Aspirante();
        MestreJedi.getInstance().addAspiranteApto(aspirante);

        assertEquals(true, aspirante.progredir());
    }

    @Test
    void deveRetornarAspiranteInvalido(){
        Aspirante aspirante = new Aspirante();
        assertEquals(false, aspirante.progredir());
    }
}
