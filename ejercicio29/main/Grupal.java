package ar.edu.unlp.info.oo1.ejercicio29;

public class Grupal extends Plan {

	public Grupal(int cantP) {
		super(cantP);
	}
	public double precioBase() {
		return 800 * this.cantIp;
	}

	public double montoPenalizacion(int count) {
		if (count > this.getCantIP()) {
			int excedente = count - this.getCantIP();
			return excedente * 500;
		} return 0;
	}
	
	@Override
	public boolean antiguedadMayor(LocalDate fechaAlta) {
		if (Period.between(fechaAlta, LocalDate.now()).getYears() > 10) {
			return true;
		}
		return false;
	}
	
}
