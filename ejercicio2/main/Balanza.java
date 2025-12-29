package ar.edu.unlp.info.oo1.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Balanza {
	private int cantidadDeProductos;
	private double precioTotal, pesoTotal;
	private List<Producto> productos;
	
	public Balanza() {
		this.productos = new ArrayList<Producto>();
		this.ponerEnCero();
	}
	
	public int getCantidadDeProductos() {
		return this.cantidadDeProductos;
	}
	public double getPesoTotal() {
		return this.pesoTotal;
	}
	public double getPrecioTotal() {
		return this.precioTotal;
	}
	public void ponerEnCero() {
		this.cantidadDeProductos = 0;
		this.precioTotal = 0;
		this.pesoTotal = 0;
	}
	
	public void agregarProducto(Producto producto) {
		this.productos.add(producto);
		this.cantidadDeProductos++;
		this.precioTotal += producto.getPrecio();
		this.pesoTotal += producto.getPeso();
	}
	
	public Ticket emitirTicket() {
		return new Ticket(this.cantidadDeProductos, this.pesoTotal, this.precioTotal);
	}
	
	public List<Producto> getProductos(){
		return productos;
	}
}
