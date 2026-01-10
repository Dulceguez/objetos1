package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class PropiedadTest {
	
	private Propiedad propiedad;
	private Reserva r;
	@BeforeEach
	void setUp() {
		PoliticaCancelacion p = new Flexible();
		propiedad = new Propiedad("34 27","Duplex",10, p) ;
		DateLapse periodo = new DateLapse(LocalDate.of(25, 1, 1),LocalDate.of(25, 1, 10));
		propiedad.reservar(periodo);
		r = propiedad.getReservas().get(0);
	}
	@Test
	void testGetDisponibilidad() {
		assertFalse(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(25, 1, 9), LocalDate.of(25, 1, 11))));
		assertFalse(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(25, 1, 10), LocalDate.of(25, 1, 11))));
		assertTrue(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(25, 1, 11), LocalDate.of(25, 1, 12))));
		
		assertFalse(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(25, 1, 1), LocalDate.of(25, 1, 2))));
		assertFalse(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(24, 12, 31), LocalDate.of(25, 1, 1))));
		assertTrue(propiedad.getDisponibilidad(new DateLapse(LocalDate.of(24, 12, 30), LocalDate.of(24, 12, 31))));
	}
	@Test
	void testCancelarReserva() {
		assertEquals(90, propiedad.cancelarReserva(r));
		assertEquals(0, propiedad.cancelarReserva(r));
		
	}
}
