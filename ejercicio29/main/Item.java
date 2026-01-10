package ar.edu.unlp.info.oo1.ejercicio29;

public class Item {
	private String nombre;
	private int cant;
	private double precioUnitario;
	
	public Item(String nombre, int cant, double precioUnitario) {
		super();
		this.nombre = nombre;
		this.cant = cant;
		this.precioUnitario = precioUnitario;
	}
	
	public double precioFinal() {
		return cant * precioUnitario;
	}
}
