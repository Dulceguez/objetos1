package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.util.List;

public class SesionDeJuego extends Actividad {
	private int duracion;
	private List<Item> items;
	
	public SesionDeJuego(LocalDate fecInicio, String ip, int duracion) {
		super(fecInicio, ip);
		this.duracion = duracion;
	}

	public double monto() {
		if (duracion > 360) {
			return precioItems(); 
		}return 0;
	} 
	public double precioItems() {
		return items.stream()
				.mapToDouble(item->item.precioFinal())
				.sum();
	}
	
	
}
