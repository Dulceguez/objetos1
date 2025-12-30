package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Circulo implements Figura {
	private double diametro, radio;
	
	public Circulo() {
	
	}
	
	public void setDiametro(double valor) {
		this.diametro = valor;
	}
	public double getDiametro() {
		return Math.PI * this.radio;
	}
	public void setRadio(double rad) {
		this.radio = rad;
	}
	public double getRadio() {
		return this.radio;
	}

	public double calcularPerimetro() {
		return Math.PI * this.getDiametro();
	}

	public double calcularArea() {
		return Math.PI * (this.radio * this.radio);
	}

	@Override
	public String toString() {
		return "Circulo [diametro=" + diametro + ", radio=" + radio + ", getDiametro()=" + getDiametro()
				+ ", getRadio()=" + getRadio() + ", calcularPerimetro()=" + calcularPerimetro() + ", calcularArea()="
				+ calcularArea();
	}
}
