package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PrismaRectangularTest {
	
	PrismaRectangular prisma;
	
	@BeforeEach
	void setUp() {
		prisma = new PrismaRectangular("Marmol", "Azul", 6,3,9);
	}
	@Test
	void testVolumen() {
		assertEquals(162, prisma.getVolumen());
	}
	@Test
	void testSuperficie() {
		assertEquals(198, prisma.getSuperficie());
	}
}
