package teste.testare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import agentie.PachetTuristic;
import teste.categorii.CategorieUtilizareBoundary;
import teste.categorii.CategorieUtilizareFake;
import teste.dubluri.PersoanaFake;

public class TestPachetTuristic {
    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaEligibila() {

        PersoanaFake persoanaFake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Portugalia", 3500.2);

        persoanaFake.setValoareGetVarsta(22);

        assertTrue(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testPoateRezervaVarstaNeeligibila() {
        PersoanaFake persoanaFake = new PersoanaFake();
        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Portugalia", 3500.2);

        persoanaFake.setValoareGetVarsta(17);

        assertFalse(pachetTuristic.poateRezerva());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testAplicaDiscountVarstnici() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(67);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Portugalia", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pretDiscount = pachetTuristic.getPret();

        assertEquals(450.0, pretDiscount, 0.1);
    }

    @Test
    @Category({CategorieUtilizareBoundary.class, CategorieUtilizareFake.class})
    public void testAplicaDiscountTineri() {
        PersoanaFake persoanaFake = new PersoanaFake();
        persoanaFake.setValoareGetVarsta(22);

        PachetTuristic pachetTuristic = new PachetTuristic(persoanaFake, "Portugalia", 500.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pretDiscount = pachetTuristic.getPret();

        assertEquals(500.0, pretDiscount, 0.1);
    }
}
