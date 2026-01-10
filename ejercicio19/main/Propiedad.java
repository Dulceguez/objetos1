package ar.edu.unlp.info.oo1.ejercicio19;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class Propiedad {
	private String direccion, nombreDescriptivo;
	private double precioNoche;
	private List<Reserva> reservas;
	private PoliticaCancelacion pCancelacion;
	
	public Propiedad(String direc, String descripcion, double pNoche, PoliticaCancelacion p) {
		this.direccion = direc;
		this.nombreDescriptivo = descripcion;
		this.precioNoche = pNoche;
		this.reservas = new ArrayList<Reserva>();
		pCancelacion = p;
	}
	public boolean getDisponibilidad(DateLapse periodo) {
		return !reservas.stream()
				.anyMatch(reserva->reserva.getDisponible(periodo));
	}
	public void reservar(DateLapse periodo) {
		reservas.add(new Reserva(periodo));
	}
	public double precioReserva(Reserva reserva) {
		return this.precioNoche * reserva.getCantNoches();
	}
	public double cancelarReserva(Reserva reserva) {
		if (!this.reservas.contains(reserva)) {
	        return 0;
	    }
		double monto = pCancelacion.devolucion(reserva, this.precioReserva(reserva));

	    this.reservas.remove(reserva);

	    return monto;
	}
	public List<Reserva> getReservas() {
		return this.reservas;
	}
	public void setPoliticaCancelacion(PoliticaCancelacion p) {
		this.pCancelacion = p;
	}
	
}	
