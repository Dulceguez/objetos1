package ar.edu.unlp.info.oo1.ejercicio10;

public class EmpleadoJerarquico extends Empleado {
	
	public double suerldoBasico() {
		return super.sueldoBasico() + this.bonoPorCategoria();
	}
	public double montoBasico() {
		return 45000;
	}
	public double bonoPorCategoria() {
		return 8000;
	}
}
