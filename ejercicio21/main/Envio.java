package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public abstract class Envio {
	private LocalDate fecha;
	private String direcOrigen, direcDestino;
	protected double pesoGramos;
	
	
	public Envio(LocalDate fecha, String direcOrigen, String direcDestino, double pesoGramos) {
		this.fecha = fecha;
		this.direcOrigen = direcOrigen;
		this.direcDestino = direcDestino;
		this.pesoGramos = pesoGramos;
	}
	public boolean incluida(DateLapse periodo) {
		return periodo.includesDate(fecha);
	}
	public abstract double getCosto();
}
