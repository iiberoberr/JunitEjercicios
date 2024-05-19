package ejercicio3;

import java.util.ArrayList;

public class Factura {
	
	/* Crea la lista de los productos comprados
	*/
	ArrayList<Producto> productos;
	
	public Factura() {
		/* poner a nueva la lista de productos
		*/
		productos = new ArrayList<Producto>();
	}
	
	public void meterProducto(Producto productoAdd) {
		/* meter producto en la lista de productos
		*/
		productos.add(productoAdd);
	}
	
	public float factura() {
		/* recorrer toda la lista de productos y sumar todos los precios totales para devilverlo
		*/
		float suma=0;
		for (Producto producto : productos) {
			suma = (suma + producto.precioTotal());	
		}
		return suma;
	}
	
	public float aplicarIVA(float iva) {
		/* sacar el iva con el porcentaje partiendo de la función anterir
		*/
		float total=this.factura();
		return total*(100-iva)/100;
	}
}
