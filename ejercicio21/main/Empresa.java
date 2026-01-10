package ar.edu.unlp.info.oo1.ejercicio21;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo1.ejercicio16.DateLapse;

public class Empresa {
	private List<Cliente> clientes;
	
	public Empresa() {
		clientes = new ArrayList<Cliente>();
	}
	
	public double montoTotal(Cliente cliente, DateLapse periodo) {
		if (clientes.contains(cliente)) {
			return cliente.calcularMontoTotal(periodo);
		}return 0;
	}
}
