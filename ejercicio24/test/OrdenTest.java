package ar.edu.unlp.info.oo1.ejercicio24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

public class OrdenTest {
	
	Usuario user;
	OrdenCompra ordenCompra;
	OrdenServicio ordenServicio;
	Producto p;
	
	@BeforeEach
	void setUp() {
		user = new Usuario("Juan Martinez","Larrea 5800, Mar del Plata");
		
		ordenCompra = new OrdenCompra(LocalDate.now(),"Larrea 5800, Mar del Plata",0);
		Producto p = new Producto("Panel Solar","plastico",35000,false);
		ordenCompra.agregarProducto(p);
		p = new Producto("Compostera","madera",8000,true);
		ordenCompra.agregarProducto(p);
		
		ordenServicio = new OrdenServicio(LocalDate.now(),"Larrea 5800, Mar del Plata","instalación de calefón solar",5);
		p = new Producto("Calefon Solar","reciclable",50000,false);
		ordenServicio.agregarProducto(p);
		Tecnico t = new Tecnico("Lucía Iraola","instalaciones solares",4500);
		ordenServicio.agregarTecnico(t);
	}
	// orden de compra --> particiones equivalentes: productos < 5 y productos >= 5
	//						valores de borde: 4, 5 y 6
	//
	// orden de servicio --> particiones equivalentes: horas < 10 y horas >= 10
	//						valores de borde: 10, 11 y 12
	
	@Test
	void testCalcularCosto() {
		assertEquals(43000, ordenCompra.calcularCosto(), 0.001);
		assertEquals(72500, ordenServicio.calcularCosto(), 0.001);
	}
}
