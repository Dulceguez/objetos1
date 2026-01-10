package ar.edu.unlp.info.oo1.ejercicio19;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class UsuarioTest {
	
	private Usuario usuario;
	private Propiedad propiedad;
	private PoliticaCancelacion p;
	private Reserva r;
	
	@BeforeEach
	void setUp() {
		p = new Flexible();
		usuario = new Usuario("Oscar","34 27","1234");
		propiedad = new Propiedad("34 27","Duplex",10,p);
	
		usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 5), LocalDate.of(25, 1, 10)));
		r = propiedad.getReservas().get(0); // reserva que acabo de agregar
	}
	@Test
	void testReservar() {
		assertFalse(usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 4), LocalDate.of(25, 1, 5))));
		assertTrue(usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 3), LocalDate.of(25, 1, 4))));
		assertFalse(usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 6), LocalDate.of(25, 1, 10))));
		assertFalse(usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 10), LocalDate.of(25, 1, 11))));
		assertTrue(usuario.reservar(propiedad, new DateLapse(LocalDate.of(25, 1, 11), LocalDate.of(25, 1, 12))));
	}
	@Test
	void testCancelar() {
		assertEquals(50, usuario.cancelarReserva(propiedad, r));
		assertEquals(0, usuario.cancelarReserva(propiedad, r));
	}
}
