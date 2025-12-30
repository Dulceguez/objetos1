package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuerpo3D  {
	private double altura, volumen, superficieExterior;
	private Figura caraBasal;
	
	public Cuerpo3D() {
		
	}
	
	public void setAltura(double valor) {
		this.altura = valor;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setCaraBasal(Figura cara) {
		this.caraBasal = cara;
	}
	
	/*
	 * 	El volumen de un cuerpo es: área-cara-basal * altura
	 */
	public double getVolumen() {
		return caraBasal.calcularArea() * this.altura;
	}
	
	/*
	 *  El área o superficie exterior de un cuerpo es: 
		2* área-cara-basal + perímetro-cara-basal * altura-del-cuerpo
	 */
	public double getSuperficieExterior() {
		return 2 * this.caraBasal.calcularArea() + (this.caraBasal.calcularPerimetro() * this.altura);
	}
}
