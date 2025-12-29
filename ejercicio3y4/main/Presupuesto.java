package ar.edu.unlp.info.oo1.ejercicio3_Presupuesto;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;
	
	public Presupuesto(String c) {
		this.fecha = LocalDate.now();
		this.cliente = c;
		this.items = new ArrayList<Item>();
	}
	
	public void agregarItem(Item i) {
		items.add(i);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i=0; i<items.size(); i++) {
			total += items.get(i).costo();
		}
		return total;
	}
	public String getCliente() {
		return cliente;
	}
	public LocalDate getFecha() {
		return this.fecha;
	}
}
