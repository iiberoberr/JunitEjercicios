package ejercici22;


public interface Transporte {
	
	/* metodo para incluir un paquete en el transporte
	*/
	public void incluirPaquete(Paquete paquete);
	
	/* metodo para sacar el peso total del transporte
	*/
	public float pesoTotal();
	
	/* metodo para recoger la distancia recorrida
	*/
	public int recorrerDistancia();


}
