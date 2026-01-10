package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrdenServicio extends Orden {
	private String descripcion;
	private int horas;
	private List<Tecnico> tecnicos;
	
	public OrdenServicio(LocalDate fec, String domi, String desc, int horas) {
		super(fec,domi);
		this.descripcion = desc;
		this.horas = horas;
		this.tecnicos = new ArrayList<Tecnico>();
	}
	public double calcularCosto() {
		return tecnicos.stream()
				.mapToDouble(tecnico->tecnico.getValorHora()*horas)
				.sum() + super.calcularCosto();
	}
	public void agregarTecnico(Tecnico t) {
		tecnicos.add(t);
	}
	public double descuento() {
		if (horas > 10) {
			return 0 * 9;
		}return 1;
	}
}
