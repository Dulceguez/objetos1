package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class EnvioInterurbano extends Envio {
	private double distanciaKm;

	public EnvioInterurbano(LocalDate fecha, String direcOrigen, String direcDestino, double pesoGramos,
			double distanciaKm) {
		super(fecha, direcOrigen, direcDestino, pesoGramos);
		this.distanciaKm = distanciaKm;
	}
	
	public double getCosto() {
		double costo = 0;
		if(distanciaKm < 100) {
			return costo += 20 * distanciaKm;
		}else if (distanciaKm >= 100 && distanciaKm < 500) {
				return costo += 25 * distanciaKm;
			}else return costo += 30 * distanciaKm;
	}
}
