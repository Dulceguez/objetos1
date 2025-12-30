package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CilindroTest {
	
	Cilindro cilindro;
	
	@BeforeEach
	void setUp() {
		cilindro = new Cilindro("Hierro","Negro",2,4);
	}
	
	@Test
	void testVolumen() {
		assertEquals(100.530964914873376, cilindro.getVolumen());
	}
	@Test
	void testSuperficie() {
		assertEquals(75.398223686155032, cilindro.getSuperficie());
	}
}
