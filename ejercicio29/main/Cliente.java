package ar.edu.unlp.info.oo1.ejercicio29;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Cliente {
	private String nombre;
	private LocalDate fechaAlta;
	private Plan plan;
	private List<Actividad> actividades;
	
	public Cliente(String nombre, LocalDate fechaAlta) {
		super();
		this.nombre = nombre;
		this.fechaAlta = fechaAlta;
	}
	public void cambiarPlan(Plan plan) {
		this.plan = plan;
	}
	public double montoTotal(LocalDate fecIni, LocalDate fecFin) {
		return plan.precioBase() + montoActividades(fecIni,fecFin) + montoPenalizacion(fecIni,fecFin);
	}
	public double montoActividades(LocalDate fecIni, LocalDate fecFin) {
		return actividades.stream()
				.filter(actividad->actividad.estaEnIntervalo(fecIni, fecFin))
				.mapToDouble(a->a.monto())
				.sum();
	}
	public double montoPenalizacion(LocalDate fecIni, LocalDate fecFin) {
		if (plan.antiguedadMayor(this.fechaAlta)) {
			return 0;
		}
		
		int cont = (int) actividades.stream()
				.filter(actividad->actividad.estaEnIntervalo(fecIni, fecFin))
				.map(a-> a.getIp())
				.distinct()
				.count();
		
		return plan.montoPenalizacion(cont);		
	}
}
