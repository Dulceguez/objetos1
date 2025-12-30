package ar.edu.unlp.info.oo1.ejercicio8;

import java.time.LocalDate;

public class Mamifero {
	private String nombre, especie;
	private Mamifero madre, padre;
	private LocalDate nacimiento;
	
	public Mamifero() {
		
	}
	
	public Mamifero(String nombre) {
		this.nombre = nombre;
	}
	public String getIdentificador() {
		return this.nombre;
	}
	public void setIdentificador(String id) {
		this.nombre = id;
	}
	public String getEspecie() {
		return this.especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public LocalDate getFechaNacimiento() {
		return this.nacimiento;
	}
	public void setFechaNacimiento(LocalDate fecha) {
		this.nacimiento = fecha;
	}
	public void setMadre(Mamifero madre) {
		this.madre = madre;
	}
	public Mamifero getMadre() {
		return this.madre;
	}
	public void setPadre(Mamifero padre) {
		this.padre = padre;
	}
	public Mamifero getPadre() {
		return this.padre;
	}
	public Mamifero getAbueloMaterno() {
		return this.getMadre()!= null ?this.getMadre().getPadre() : null;
	}
	public Mamifero getAbuelaMaterna() {
		return this.getMadre()!= null ? this.getMadre().getMadre() : null;
	}
	
	public Mamifero getAbueloPaterno() {
		return this.getPadre() != null ? this.getPadre().getPadre() : null;
	}
	public Mamifero getAbuelaPaterna() {
		return this.getPadre() != null ? this.getPadre().getMadre() : null;
	}
	public boolean tieneComoAncestroA(Mamifero unMamifero) {
		if (this.getMadre() == unMamifero || this.getPadre() == unMamifero) {
			return true;
		}
		boolean madre = this.getMadre() != null && this.getMadre().tieneComoAncestroA(unMamifero);
		boolean padre = this.getPadre() != null && this.getPadre().tieneComoAncestroA(unMamifero);
		
		return madre || padre;
	}
}
