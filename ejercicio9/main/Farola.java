package ar.edu.unlp.info.oo1.ejercicio9;

import java.util.ArrayList;
import java.util.List;

public class Farola {
	private boolean encendida;
	private List<Farola> vecinas;
	
	/*
	* Crear una farola. Debe inicializarla como apagada
	*/
	public Farola() {
		this.encendida = false;
		vecinas = new ArrayList<Farola>();
	}
	/*
	* Retorna true si la farola está encendida.
	*/
	public boolean isOn() {
		return this.encendida;
	}
	/*
	* Retorna true si la farola está apagada.
	*/
	public boolean isOff() {
		return !this.encendida;
	}
	/*
	* Retorna sus farolas vecinas
	*/
	public List<Farola> getNeighbors(){
		return this.vecinas;
	}
	
	/*
	* Crea la relación de vecinos entre las farolas. La relación de vecinos entre las farolas es recíproca, es decir el receptor del mensaje será vecino de otraFarola, al igual que otraFarola también se convertirá en vecina del receptor del mensaje
	*/
	public void pairWithNeighbor( Farola otraFarola ) {
		if(!this.vecinas.contains(otraFarola)) {
			this.vecinas.add(otraFarola);
			otraFarola.pairWithNeighbor(this);
		}
	}
	/*
	 * Si la farola no está encendida, la enciende y propaga la acción.
	 */
	public void turnOn() {
		if(!this.isOn()) {
			this.encendida = true;
			for(Farola f: this.vecinas) {
				f.turnOn();
			}
		}
	}
	/*
	 * Si la farola no está apagada, la apaga y propaga la acción.
	 */
	public void turnOff() {
		if(!this.isOff()) {
			this.encendida = false;
			for(Farola f: this.vecinas) {
				f.turnOff();
			}
		}
	}
}