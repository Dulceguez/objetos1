package ar.edu.unlp.info.oo1.ejercicio5_inversores;

import java.util.ArrayList;
import java.util.List;

public class Inversor {
	private List<Inversion> inversiones;
	
	public Inversor() {
		this.inversiones = new ArrayList<Inversion>();
	}

	
	public void agregarInversion(Inversion unaInversion) {
		this.inversiones.add(unaInversion);
	}
	
	public void eliminarInversion(Inversion unaInversion) {
		this.inversiones.remove(unaInversion);
	}
	public double montoTotal() {
		return inversiones.stream()
				.mapToDouble(inversion->inversion.valorActual())
				.sum();
	}
}
