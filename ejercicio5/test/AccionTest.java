package ar.edu.unlp.info.oo1.ejercicio5_inversores;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccionTest {
	
	Accion accion;
	
	@BeforeEach
	void setUp() {
		accion = new Accion("Perdices", 10, 100);
	}
	
	@Test
	void testValorActual() {
		assertEquals(1000, accion.valorActual());
	}
	
}
