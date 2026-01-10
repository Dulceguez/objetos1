package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public class ReproduccionDeVideo extends Actividad {
	private int duracionTotal, duracionPublicidad;

	public ReproduccionDeVideo(LocalDate fecInicio, String ip, int duracionTotal, int duracionPublicidad) {
		super(fecInicio, ip);
		this.duracionTotal = duracionTotal;
		this.duracionPublicidad = duracionPublicidad;
	}
	public int duracionReal() {
		return duracionTotal - duracionPublicidad;
	}
	public double monto() {
		return 10 * duracionReal();
	}
	
}
