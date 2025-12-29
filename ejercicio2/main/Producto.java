package ar.edu.unlp.info.oo1.ejercicio2;

public class Producto {
	private double peso, precioPorKilo;
	private String descripcion;
	
	public Producto(String d, double p, double precio) {
		this.descripcion = d;
		this.peso = p;
		this.precioPorKilo = precio;
	}
	
	
	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getPrecioPorKilo() {
		return precioPorKilo;
	}


	public void setPrecioPorKilo(double precioPorKilo) {
		this.precioPorKilo = precioPorKilo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getPrecio() {
		return this.peso * this.precioPorKilo;
	}
}
