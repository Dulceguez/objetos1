package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;

public abstract class Actividad {
	private LocalDate fecInicio;
	private String ip;
	
	public Actividad(LocalDate fecInicio, String ip) {
		super();
		this.fecInicio = fecInicio;
		this.ip = ip;
	}
	public boolean estaEnIntervalo(LocalDate fecIni, LocalDate fecFin) {
		return ((fecIni.isBefore(fecInicio) || fecIni.isEqual(fecInicio))&&
				((fecFin.isAfter(fecInicio) || fecFin.isEqual(fecInicio))));
	}
	public boolean esIgual(String ip) {
		return this.ip.equals(ip);
	}
	public String getIp() {
		return this.ip;
	}
	public abstract double monto();
	
}
