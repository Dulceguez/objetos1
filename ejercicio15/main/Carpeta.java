package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Carpeta {
	private List<Email> emails;
	private String nombre;
	
	public Carpeta(String nombre) {
		this.emails = new ArrayList<Email>();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void agregarMail(Email e) {
		this.emails.add(e);
	}
	public void mover(Email email, Carpeta destino) {
		emails.remove(email);
		destino.agregarMail(email);
	}
	public Email esIgual(String texto) {
		return emails.stream()
				.filter(email->email.esIgual(texto))
				.findFirst()
				.orElse(null);
	}
	public Integer tamanio() {
		return emails.stream()
				.mapToInt(email->email.tamanio())
				.sum();
	}
}
