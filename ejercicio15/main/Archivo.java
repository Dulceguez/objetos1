package ar.edu.unlp.info.oo1.ejercicio15;

public class Archivo {
	private String nombre;
	
	public Archivo(String n) {
		this.nombre = n;
	}
	public Integer tamanio() {
		return nombre.length();
	}
}
