package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EsferaTest {
	
	Esfera esfera;
	
	@BeforeEach
	void setUp() {
		esfera = new Esfera("Madera", "Rojo", 3);
	}
	
	@Test
	void testVolumen() {
		assertEquals(113.09733552923254, esfera.getVolumen());
	}
	@Test
	void testSuperficie() {
		assertEquals(113.097335529232548, esfera.getSuperficie());
	}
}
