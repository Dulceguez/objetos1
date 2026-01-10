package ar.edu.unlp.info.oo1.ejercicio19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class Usuario {
	private String nombre, direccion, dni;
	private List<Propiedad> propiedades;
	
	public Usuario(String nombre, String direccion, String dni) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.dni = dni;
		this.propiedades = new ArrayList<Propiedad>();
	}
	public boolean reservar(Propiedad propiedad, DateLapse periodo) {
		if(propiedad.getDisponibilidad(periodo)) {	
			propiedad.reservar(periodo);
			return true;
		
		} return false;
	}
	public double retribucion(DateLapse periodo) {
		double total = propiedades.stream()
				.mapToDouble(propiedad->
				propiedad.getReservas().stream()
				.filter(reserva->reserva.getPeriodo().overlaps(periodo))
				.mapToDouble(reserva->propiedad.precioReserva(reserva))
				.sum()
		)
		.sum();
		return total * 0.75;
	}
	public double cancelarReserva(Propiedad propiedad, Reserva r) {
		return propiedad.cancelarReserva(r);
	}
	
}
