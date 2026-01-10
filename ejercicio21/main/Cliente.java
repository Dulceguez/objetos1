package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public abstract class Cliente {
	private String nombre, direc;
	private List<Envio> envios;
	
	public Cliente(String unNombre, String unaDirec) {
		this.nombre = unNombre;
		this.direc = unaDirec;
		envios = new ArrayList<Envio>();
	}
	
	public void agregarEnvio(Envio envio) {
		envios.add(envio);
	}
	public double calcularMontoTotal(DateLapse periodo) {
		return envios.stream()
				.filter(envio->envio.incluida(periodo))
				.mapToDouble(envio->envio.getCosto())
				.sum();
	}
}
