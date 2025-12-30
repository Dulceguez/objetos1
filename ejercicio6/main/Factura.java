package ar.edu.unlp.info.oo1.ejercicio6_distribuidora_electrica;

import java.time.LocalDate;

public class Factura {
	private LocalDate fechaEmision;
	private Usuario usuario;
	
	public Factura(Usuario user) {
		this.fechaEmision = LocalDate.now();
		this.usuario = user;
	}
	
	public double montoFinal() {
		return usuario.getCostoDelConsumo() - this.factorDePotencia();
	}
	
	public double factorDePotencia() {
		if (usuario.getConsumoEnergiaReactica()) {
			return usuario.getCostoDelConsumo() * 0.1;
		} 
		return 0;
	}
	
	public String emitirFactura() {
		String aux = usuario.getNombre()+"\n";
		aux += this.fechaEmision+"\n";
		if (this.factorDePotencia() != 0) {
			aux += "Bonificacion "+ this.factorDePotencia()+"\n";
		}
		aux += this.montoFinal();
		return aux;
	}
	
	/*
	 * 	prueba
	 */
	
	public static void main(String[]args) {
		Usuario user = new Usuario("Raul","27 n 234",true,10);
		Factura fac = new Factura(user);
		CuadroTarisfario c = new CuadroTarisfario();
		
		System.out.println(fac.emitirFactura());
	}
}
