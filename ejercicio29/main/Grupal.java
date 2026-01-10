package ar.edu.unlp.info.oo1.ejercicio29;

public class Grupal extends Plan {

	public Grupal(int cantP) {
		super(cantP);
	}
	public double precioBase() {
		return 800 * super.cantIp;
	}

	public double montoPenalizacion() {
		return 500;
	}
	
}
