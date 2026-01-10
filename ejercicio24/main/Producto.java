package ar.edu.unlp.info.oo1.ejercicio24;

public class Producto {
	private String nombre, tipoMaterial;
	private double costo;
	private boolean esBiodegradable;
	
	public Producto(String nombre, String tipoMaterial, double costo, boolean bio) {
		this.nombre = nombre;
		this.tipoMaterial = tipoMaterial;
		this.costo = costo;
		this.esBiodegradable = bio;
	}
	public double getCosto() {
		return costo;
	}
}
