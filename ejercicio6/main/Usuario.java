package ar.edu.unlp.info.oo1.ejercicio6_distribuidora_electrica;

import ar.edu.unlp.info.oo1.ejercicio6_distribuidora_electrica.CuadroTarisfario;

public class Usuario {
	private String nombre, domicilio;
	private boolean consumoEnergiaReactiva;
	private double consumoEnergiaActiva;
	
	public Usuario(String nombre, String domicilio, boolean consumoEnergiaReactiva, double consumoEnergiaActiva) {
		this.nombre = nombre;
		this.domicilio = domicilio;
		this.consumoEnergiaReactiva = consumoEnergiaReactiva;
		this.consumoEnergiaActiva = consumoEnergiaActiva;
	}
	
	public boolean getConsumoEnergiaReactica() {
		return this.consumoEnergiaReactiva;
	}
	public double getCostoDelConsumo() {
		CuadroTarisfario cuadro = new CuadroTarisfario();
		return this.consumoEnergiaActiva * cuadro.getPreciokWh();
	}
	
	public String getNombre() {
		return this.nombre;
	}
}
