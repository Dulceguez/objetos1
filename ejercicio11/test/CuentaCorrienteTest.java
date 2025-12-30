package ar.edu.unlp.info.oo1.ejercicio11;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CuentaCorrienteTest {
	
	CuentaCorriente cuenta;
	
	@BeforeEach
	void setUp() {
		cuenta = new CuentaCorriente();
		cuenta.depositar(100);
		cuenta.setDescubierto(500);
	}
	
	@Test
	void extraerTest() {
		assertEquals(true, cuenta.extraer(200));
		assertEquals(400, cuenta.getDescubierto());
	}
	@Test
	void transferirACuenta() {
		CuentaCorriente otraCuenta = new CuentaCorriente();
		cuenta.depositar(100);
		cuenta.setDescubierto(500);
		assertEquals(true, cuenta.transferirACuenta(200, otraCuenta));
		assertEquals(400, cuenta.getDescubierto());
		
	}
}
