package ar.edu.unlp.info.oo1.ejercicio29;

public abstract class Plan {
	protected int cantIp;

	public Plan(int cantIP) {
		this.cantIp = cantIP;
	}
	public int getCantIP() {
		return this.cantIp;
	}
	public abstract double precioBase();
	public abstract double montoPenalizacion(int count);
	public abstract boolean antiguedadMayor(LocalDate fechaAlta);
}
