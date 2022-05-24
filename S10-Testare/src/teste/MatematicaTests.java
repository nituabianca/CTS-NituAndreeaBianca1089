package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Matematica;

public class MatematicaTests {

	@Test
	public void testSuma() {
		Matematica mate=new Matematica(); 
		int rezObtinut=mate.suma(8, 6);
		assertEquals(14, rezObtinut);
	}
	
	@Test
	public void testRaport() {
		Matematica mate=new Matematica(); 
		double rezObtinut=mate.raport(24, 6);
		assertEquals(4, rezObtinut,0.001);
	}
	@Test
	public void testraportShouldThrowexception() {
		Matematica mate=new Matematica(); 
		try {
			mate.raport(45, 0);
			fail("nu trb sa ajung aici");
		}
		catch(IllegalArgumentException ex) {
			
		}
	}
}
