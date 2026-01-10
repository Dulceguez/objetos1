package ar.edu.unlp.info.oo1.ejercicio15;

import java.util.ArrayList;
import java.util.List;

public class ClienteDeCorreo {
	private List<Carpeta> carpetas;
	private Carpeta inbox;
	
	public ClienteDeCorreo() {
		this.carpetas = new ArrayList<Carpeta>();
		this.inbox = new Carpeta("inbox");
		this.carpetas.add(inbox);
	}
	public void recibir(Email email) {
		inbox.agregarMail(email);
	}
	public Email buscar(String texto) {
		return carpetas.stream()
				.map(carpeta->carpeta.esIgual(texto))
				.filter(email->email != null)
				.findFirst().orElse(null);
	}
	public Integer espacioOcupado() {
		return carpetas.stream()
				.mapToInt(carpeta->carpeta.tamanio())
				.sum();
	}
}
