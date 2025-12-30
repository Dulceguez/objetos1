package ar.edu.unlp.info.oo1.ejercicio14;

import java.util.ArrayList;
import java.util.List;

public class ReporteDeConstruccion {
	private List<Pieza> piezas;
	
	public ReporteDeConstruccion() {
		piezas = new ArrayList<Pieza>();
	}
	public void agregarPieza(Pieza pieza) {
		this.piezas.add(pieza);
	}
	public double volumenDeMaterial(String material) {
		return piezas.stream()
				.filter(p->p.getMaterial().equals(material)).mapToDouble(pieza->pieza.getVolumen())
				.sum();
	}
	public double superficieDeColor(String color) {
		return piezas.stream()
				.filter(p->p.getColor().equals(color)).mapToDouble(pieza->pieza.getSuperficie())
				.sum();
	}
}
