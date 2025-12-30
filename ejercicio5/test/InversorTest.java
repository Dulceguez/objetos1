package ar.edu.unlp.info.oo1.ejercicio5_inversores;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InversorTest {

	Inversor inversor;
	
	@BeforeEach
	void setUp() {
		inversor = new Inversor();
		LocalDate fecha;
		Accion a = new Accion("Perdices", 10, 100);
		PlazoFijo p = new PlazoFijo(LocalDate.of(2025, 10, 1), 1000, 10); 
		inversor.agregarInversion(a);
		inversor.agregarInversion(p);
	}
	
	@Test
	void valorInversionActualTest() {
		assertEquals(2150, inversor.montoTotal()); // este valor va a ir cambiando porque las acciones cambian 
													// de valor a medida que pasan los dias
		Accion a = new Accion("Coca Cola", 20, 200);
		inversor.agregarInversion(a);
		assertEquals(6150, inversor.montoTotal());
		inversor.eliminarInversion(a);
		assertEquals(2150, inversor.montoTotal());
	}
}
