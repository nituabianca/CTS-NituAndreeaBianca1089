package teste.testare;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.Test;

import agentie.AgentieTurism;
import teste.categorii.CategorieUtilizareDummy;
import teste.categorii.CategorieUtilizareFake;
import teste.dubluri.PachetDummy;
import teste.dubluri.PachetFake;

import static org.junit.Assert.assertEquals;

public class TestAgentieDubluri {

    @Test
    @Category(CategorieUtilizareDummy.class)
    public void testAdaugaPachet() {

        PachetDummy pachetDummy = new PachetDummy();
        AgentieTurism agentie = new AgentieTurism();

        agentie.adaugaPachet(pachetDummy);
        assertEquals(1, agentie.getNrPachetTuristice());
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testCalculeazaPretTotal() {

        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();
        pachetFake1.setPret(1000);
        pachetFake2.setPret(800);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        assertEquals(1800, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test
    @Category(CategorieUtilizareFake.class)
    public void testInverseazaCalculeazaPretTotal() {

        PachetFake pachetFake1 = new PachetFake();
        PachetFake pachetFake2 = new PachetFake();
        pachetFake1.setPret(1000);
        pachetFake2.setPret(800);

        AgentieTurism agentieTurism = new AgentieTurism();
        agentieTurism.adaugaPachet(pachetFake1);
        agentieTurism.adaugaPachet(pachetFake2);

        double total = agentieTurism.calculareSumaTotalaPachete();
        assertEquals(pachetFake1.getPret(), total - pachetFake2.getPret(), 0.01);

    }

    @Test
    public void testBoundaryCalculeazaPretTotal() {

        AgentieTurism agentieTurism = new AgentieTurism();
        assertEquals(0, agentieTurism.calculareSumaTotalaPachete(), 0.01);
    }

    @Test(timeout = 100)
    @Category(CategorieUtilizareFake.class)
    public void testPerformanceCalculeazaPretTotal() {

        AgentieTurism agentieTurism = new AgentieTurism();
        for (int i = 0; i < 100; i++) {
            PachetFake pachetFake = new PachetFake();
            pachetFake.setPret(1800);
            agentieTurism.adaugaPachet(pachetFake);
        }
        double suma = agentieTurism.calculareSumaTotalaPachete();
    }
}
