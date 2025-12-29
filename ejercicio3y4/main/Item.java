package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

public class Item {
	private String detalle;
	private int cantidad;
	private double costoUnitario;
	
	public Item(String d, double costo, int cant) {
		this.detalle = d;
		this.cantidad = cant;
		this.costoUnitario = costo;
	}
	public double costo() {
		return this.costoUnitario * this.cantidad;
	}
	public double getCostoUnitario() {
		return this.costoUnitario;
	}
	public int getCantidad() {
		return this.cantidad;
	}
}
