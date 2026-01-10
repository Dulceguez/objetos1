package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class Moderada extends PoliticaCancelacion {
	
	
	public Moderada() {

	}

	public double devolucion(Reserva reserva, double montoReserva) {
		DateLapse p = new DateLapse(reserva.getPeriodo().getFrom(), LocalDate.now());
		if(p.sizeInDays() >= 7) {
			return montoReserva;
		}
		if(p.sizeInDays() >= 2) {
			return montoReserva / 2;
		}
		return 0;
	}
}
