package ar.edu.unlp.info.oo1.ejercicio14;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReporteDeConstruccionTest {
	
	ReporteDeConstruccion reporte;
	
	@BeforeEach
	void setUp() {
		reporte = new ReporteDeConstruccion();
		reporte.agregarPieza(new Esfera("Madera", "Rojo", 3));
		reporte.agregarPieza(new Cilindro("Madera","Azul",2,4));
		reporte.agregarPieza(new PrismaRectangular("Madera", "Azul", 6,3,9));
	}
	@Test
	void testVolumenDeMaterial() {
		assertEquals(375.628300444105916, reporte.volumenDeMaterial("Madera"));
	}
	@Test
	void testSuperficieDeColor() {
		assertEquals(273.398223686155032, reporte.superficieDeColor("Azul"));
	}
	
}
