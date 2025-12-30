package ar.edu.unlp.info.oo1.ejercicio11;

public class CuentaCorriente extends Cuenta  {
	private double descubierto;
	
	public CuentaCorriente() {
		this.descubierto = 0;
	}
	public double getDescubierto() {
		return this.descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	public boolean puedeExtraer(double monto) {
		double total = this.getSaldo() + this.getDescubierto() - monto;
		if(total < 0) {
			return false;
		}
		this.setDescubierto(this.getSaldo() - monto);
		return true;
	}

}
