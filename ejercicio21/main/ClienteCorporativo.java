package ar.edu.unlp.info.oo1.ejercicio21;

public class ClienteCorporativo extends Cliente {
	private String cuit;
	
	public ClienteCorporativo(String nombre, String direc, String cuit) {
		super(nombre, direc);
		this.cuit = cuit;
	}
}
