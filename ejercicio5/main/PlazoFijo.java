package ar.edu.unlp.info.oo1.ejercicio5_inversores;

import java.time.LocalDate;
import java.time.Period;

public class PlazoFijo implements Inversion {
	private LocalDate fecha;
	private double montoDepositado, porcentajeIntereses;
	
	public PlazoFijo(LocalDate fecha, double montoDepositado, double porcentajeReal) {
		this.fecha = fecha;
		this.montoDepositado = montoDepositado;
		this.porcentajeIntereses = porcentajeReal;
	}
	
	public double valorActual() {
		LocalDate hoy = LocalDate.now();
		
		Period periodo = Period.between(fecha,hoy); // diferencia entre fechas
		
		long totalDias = hoy.toEpochDay() - fecha.toEpochDay();
		// toEpochDay obtiene el total de dias
		
		return totalDias * this.porcentajeIntereses + this.montoDepositado;
	}
}
