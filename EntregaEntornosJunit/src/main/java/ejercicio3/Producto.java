package ejercicio3;

public class Producto {
	/* declara el nombre, precio y la cantidad del producto
	*/
	protected String nombre;
	protected float precio; 
	protected int cantidad;
	
	public Producto(String nombre, float precio, int cantidad) {
		/* constructor de prodcto
		*/
		this.nombre = nombre;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	
	public float precioTotal() {
		/* el precio de total del pedido (producto x cantidad)
		*/
		return this.precio*this.cantidad;
	}

	@Override
	public String toString() {
		/* descripción del producto/pedido
		*/
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}
	
	
}
