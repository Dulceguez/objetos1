package ar.edu.unlp.info.oo1.ejercicio5_inversores;

public class Accion implements Inversion {
	private String nombre;
	private int cantAcciones;
	private double valorUnitario;
	
	public Accion(String nombre, int cantAcciones, double valorUnitario) {
		super();
		this.nombre = nombre;
		this.cantAcciones = cantAcciones;
		this.valorUnitario = valorUnitario;
	}
	
	public double valorActual() {
		return this.cantAcciones * this.valorUnitario;
	}
}
