package ar.edu.unlp.info.oo1.ejercicio16;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateLapseTest {
	
	DateLapse rango;
	@BeforeEach
	void setUp() {
		LocalDate from = LocalDate.of(2025, 9, 7);
		LocalDate to = LocalDate.of(2025, 10, 21);
		rango = new DateLapse(from, to);
	}
	@Test
	public void testIncludesDate() {
		assertFalse(rango.includesDate(LocalDate.of(2025, 9, 6))); // false
		assertTrue(rango.includesDate(LocalDate.of(2025, 9, 7))); // true
		assertEquals(true, rango.includesDate(LocalDate.of(2025, 9, 7))); // true
		assertTrue(rango.includesDate(LocalDate.of(2025, 10, 20)));
		assertEquals(true, rango.includesDate(LocalDate.of(2025, 10, 21)));
		assertFalse(rango.includesDate(LocalDate.of(2025, 10, 22))); // false
	}
}
