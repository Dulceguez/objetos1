package ar.edu.unlp.info.oo1.ejercicio14;

public class PrismaRectangular extends Pieza {
	private double ladoMayor, ladoMenor, altura;
	
	public PrismaRectangular(String material, String color, double ladoMay, double ladoMen, double h) {
		super(material, color);
		this.ladoMayor = ladoMay;
		this.ladoMenor = ladoMen;
		this.altura = h;
	}
	public double getVolumen() {
		return ladoMayor * ladoMenor * altura; 
	}
	public double getSuperficie() {
		return 2 * (ladoMayor * ladoMenor + ladoMayor * altura + ladoMenor * altura);
	}
}
