package ar.edu.unlp.info.oo1.ejercicio29;

public class Individual extends Plan {
	private int cantMinutos;

	public Individual(int cantP, int cantMinutos) {
		super(cantP);
		this.cantMinutos = cantMinutos;
	}
	
	public double precioBase() {
		return 20 * cantMinutos;
	}
	public double montoPenalizacion() {
		return 300;
	}
}
