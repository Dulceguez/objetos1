package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;

public class Flexible extends PoliticaCancelacion {
	
	
	public Flexible() {

	}

	public double devolucion(Reserva reserva, double montoReserva) {
		if(!reserva.getPeriodo().includesDate(LocalDate.now())) {
			return montoReserva;
		}
		return 0;
	}
}
