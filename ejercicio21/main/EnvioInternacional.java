package ar.edu.unlp.info.oo1.ejercicio21;

import java.time.LocalDate;

public class EnvioInternacional extends Envio {
	private EntregaRapida entregaRapida;
	
	public EnvioInternacional(LocalDate fecha, String direcOrigen, String direcDestino, double pesoGramos, EntregaRapida rapido) {
		super(fecha, direcOrigen, direcDestino, pesoGramos);
		this.entregaRapida = rapido;
	}
	
	public double getCosto() {
		double costo = 5000;
		if (this.pesoGramos <= 1000) {
			costo += this.pesoGramos * 10;
		}else {
			costo += this.pesoGramos * 12;
		}
		
		if (entregaRapida.getEntregaRapida()) {
			return costo += 800;
		}
		return costo;
	}
}
