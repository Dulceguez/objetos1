package ar.edu.unlp.info.oo1.figurasYCuerpos;

public class Cuadrado implements Figura {
	private double lado;
	
	public Cuadrado() {
	
	}
	
	public void setLado(double valor) {
		this.lado = valor;
	}
	public double getLado() {
		return this.lado;
	}

	public double calcularPerimetro() {
		return this.lado * 4;
	}

	@Override
	public double calcularArea() {
		return this.lado * this.lado;
	}
	
	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getLado()=" + getLado() + ", calcularPerimetro()=" + calcularPerimetro()
				+ ", calcularArea()=" + calcularArea();
	}

	/*
	 * 	prueba
	 */
	public static void main(String[]args) {
		Cuadrado cuad = new Cuadrado();
		Circulo circ = new Circulo();
		
		System.out.println(cuad.toString());
		System.out.println(circ.toString());
	}
}