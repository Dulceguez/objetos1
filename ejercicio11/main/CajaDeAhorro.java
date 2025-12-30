package ar.edu.unlp.info.oo1.ejercicio11;

public class CajaDeAhorro extends Cuenta {
	
	public boolean puedeExtraer(double monto) {
		return this.getSaldo() - (this.getSaldo() * 0.02) > monto ;
	}
	
}
