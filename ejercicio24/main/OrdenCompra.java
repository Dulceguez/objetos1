package ar.edu.unlp.info.oo1.ejercicio24;

import java.time.LocalDate;

public class OrdenCompra extends Orden {
	private double precioEnvio;
	
	public OrdenCompra(LocalDate fec, String domi, double precio) {
		super(fec,domi);
		this.precioEnvio = precio;
	}
	public double descuento() {
		if(this.getProductos().size() >= 5) {
			return 0.9;
		}return 1;
	}
}
