package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class Email {
	private List<Archivo> adjuntos;
	private String titulo, cuerpo;
	
	private Email(String unTitulo, String unCuerpo) {
		this.titulo = unTitulo;
		this.cuerpo = unCuerpo;
		this.adjuntos = new ArrayList<Archivo>();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getCuerpo() {
		return cuerpo;
	}
	public boolean esIgual(String texto) {
		return titulo.equals(texto) || cuerpo.equals(texto);
	}
	public Integer tamanio() {
		return adjuntos.stream()
				.mapToInt(adjunto->adjunto.tamanio())
				.sum() + titulo.length() + cuerpo.length();
	}
	public List<Archivo> adjuntos(){
		return adjuntos;
	}
}
