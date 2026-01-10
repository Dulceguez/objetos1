package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class EnvioLocal extends Envio {
	private EntregaRapida entregaRapida;
	
	public EnvioLocal(LocalDate fecha, String direcOrigen, String direcDestino, double pesoGramos, EntregaRapida rapido) {
		super(fecha, direcOrigen, direcDestino, pesoGramos);
		this.entregaRapida = rapido;
	}

	public double getCosto() {
		double costo = 1000;
		if(entregaRapida.getEntregaRapida()) {
			costo += 500;
		}
		return costo;
	}
}
