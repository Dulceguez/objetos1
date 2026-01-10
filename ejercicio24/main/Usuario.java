package ar.edu.unlp.info.oo1.ejercicio24;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombreCompleto, domicilio;
	private List<Orden> ordenes;
	
	public Usuario(String nombre, String domi) {
		this.nombreCompleto = nombre;
		this.domicilio = domi;
		ordenes = new ArrayList<Orden>();
	}
	public void agregarOrden(Orden orden) {
		ordenes.add(orden);
	}
	public List<Orden> getOrdenes(){
		return this.ordenes;
	}
}
