package ejercicio2;

import java.util.Random;

public class GenerarIp {
	/*Declara la variable random y el máximo y mínimo como constantes por que no deverían cambiar de valor/no tendría sentido
	 */
	private Random random;
	private static final int MAX = 254;
	private static final int MIN = 1;
	
	public int generarNumero() {
		/*devuelve un número al azar entre MAX y MIN
		 */
        return random.nextInt(MAX - MIN + 1) + MIN;
    }
	
	public String generarIp() {
	String ip = "";
	/*genera 4 numeros al aza entre los parametros y los une en un string (ip) para devolverlo
	 */
	for (byte i = 0; i<=3; i++) {
		if (i==3) {
			ip+=this.generarNumero();
		}
		else {
			ip+= this.generarNumero() + "." ;
		}
	}
	return ip;
	}
	
	public GenerarIp() {
		/* poner al numero random a nuevo para utilizarlo
		*/
		random = new Random();
	}
	
}
