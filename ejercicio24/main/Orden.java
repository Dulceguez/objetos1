package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class Orden {
	private LocalDate fecha;
	private String domicilio;
	private List<Producto> productos;
	
	public Orden(LocalDate fecha, String domicilio) {
		this.fecha = fecha;
		this.domicilio = domicilio;
		this.productos = new ArrayList<Producto>();
	}
	public double calcularCosto() {
		return productos.stream()
				.mapToDouble(producto->producto.getCosto())
				.sum();
	}
	public void agregarProducto(Producto p) {
		productos.add(p);
	}
	public List<Producto> getProductos(){
		return productos;
	}
	public abstract double descuento(); 
}
