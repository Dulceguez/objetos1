package ar.edu.unlp.info.oo1.ejercicio14;

public class Cilindro extends Pieza {
	private double radio, altura;
	
	public Cilindro(String material, String color, double radio,double alt) {
		super(material, color);
		this.radio = radio;
		this.altura = alt;
	}
	public double getVolumen() {
		return 2 * Math.PI * Math.pow(this.radio, 2) * this.altura; 
	}
	public double getSuperficie() {
		return (2 * Math.PI * this.radio * this.altura) + (2 * Math.PI * Math.pow(this.radio, 2));
	}
}
