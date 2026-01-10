package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class Reserva {
	private DateLapse periodo;
	
	public Reserva(DateLapse periodo) {
		this.periodo = periodo;
	}
	public boolean getDisponible(DateLapse unPeriodo) {
		return periodo.overlaps(unPeriodo);
	}
	public int getCantNoches() {
		return periodo.sizeInDays();
	}
	public DateLapse getPeriodo() {
		return this.periodo;
	}
}
