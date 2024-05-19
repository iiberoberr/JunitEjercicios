package ejercici22;

public class Paquete {
	/* se declaran las variables destino y peso
	*/
	private String destino;
	private float peso;
	/** constructor de paquete con:
	 * @param destino
	 * @param peso
	 */
	public Paquete(String destino, float peso) {
		this.destino = destino;
		this.peso = peso;
	}
	/* getters y seters de los atriutos
	*/
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	/* descripción de un paqute en string
	*/
	@Override
	public String toString() {
		return "Paquete [destino=" + destino + ", peso=" + peso + "]";
	}
	
	
	
}
