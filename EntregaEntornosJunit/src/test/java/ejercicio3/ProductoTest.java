package ejercicio3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductoTest {
	
	/* crear una factura para testearñla
	*/
	Factura target;
	
	@BeforeEach
	void setUp() throws Exception {
		/* poner a nuevo la factura que vamos a utlizar
		*/
		target = new Factura();
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void testFactura() {
		/* crea 2 productos y los mete en la lista de productos, para calcular el precio total de la lista
		*/
		target.meterProducto(new Producto("Manzana", 1, 10));
		target.meterProducto(new Producto("Plátano", 2f, 5));
		float expected = 20;
		float resultado =target.factura();
		assertEquals(expected,resultado,"El metodo factura devuelve un valor erroneo");
	}
	
	@Test
	void testAplicarIVA() {
		/* crea 2 productos y los mete en la lista de productos, para calcular el iva de la lista
		*/
		target.meterProducto(new Producto("Manzana", 1, 50));
		target.meterProducto(new Producto("Plátano", 5f, 10));
		float expected = 50;
		float resultado = target.aplicarIVA(50);
		assertEquals(expected,resultado,"El metodo aplicarIVA devuelve un valor erroneo");
	}
	

}
