package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CajaDeAhorroTest {
	
	CajaDeAhorro cajaDeAhorro;
	
	@BeforeEach
	void setUp() {
		cajaDeAhorro = new CajaDeAhorro();
	}
	
	@Test
	void testDepositar() {
		cajaDeAhorro.depositar(100);
		assertEquals(100, cajaDeAhorro.getSaldo());
		cajaDeAhorro.depositar(100);
		cajaDeAhorro.depositar(400);
		assertEquals(600, cajaDeAhorro.getSaldo());
	}
	
	@Test
	void testExtraer() {
		cajaDeAhorro.depositar(400);
		assertEquals(true, cajaDeAhorro.extraer(300));
		assertEquals(false, cajaDeAhorro.extraer(500));
	}
	@Test
	void testTransferirACuenta() {
		cajaDeAhorro.depositar(500);
		CajaDeAhorro otraCajaDeAhorro = new CajaDeAhorro();
		assertEquals(true, cajaDeAhorro.transferirACuenta(400, otraCajaDeAhorro));
		assertEquals(400, otraCajaDeAhorro.getSaldo());
		assertEquals(false, cajaDeAhorro.transferirACuenta(200, otraCajaDeAhorro));
	}
}
