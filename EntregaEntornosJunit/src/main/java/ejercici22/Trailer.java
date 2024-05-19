package ejercici22;

import java.util.Vector;
import java.util.Random;


public class Trailer implements Transporte {

	private int distancia;
	private Vector<Paquete> paquetes;

	public Trailer() {
		/* poner el vector de paquetes a nuevo y definir la distancia a 0
		*/
		distancia = 0;
		paquetes = new Vector<Paquete>();
	}

	@Override
	public float pesoTotal() {
		/* recorrer todo el vector de paquetes y sumando sus pesos para luego devolver el peso total
		*/
		float pesoTOT=0;
		for (Paquete pak:paquetes ) {
			pesoTOT+=pak.getPeso();
		}
		return pesoTOT;
	}

	@Override
	public int recorrerDistancia() {
		/* devuelve la distancia recorrida sumandole un trayecto
		*/
		distancia+=new Random().nextInt(31) + 270;
		return distancia;
	}

	@Override
	public void incluirPaquete(Paquete paquete) {
		/* se mira si el paquete existe y si el peso que tiene es positivo
		 * 				se contempla que pueda meterse mas de un paquete con el mismo nombre y peso
		*/
		if (paquete !=null && paquete.getPeso()>0) {
			paquetes.add(paquete);
		}
	}


	
}
