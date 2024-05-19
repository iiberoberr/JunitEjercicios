package ejercici22;

import java.util.*;



public class Camioneta implements Transporte{

	private int distancia;
	private ArrayList<Paquete> paquetes;

	public Camioneta() {
		/* poner el ArrayList de paquetes a nuevo y definir la distancia a 0
		*/
		distancia = 0;
		paquetes = new ArrayList<Paquete>();
	}

	@Override
	public float pesoTotal() {
		/* recorrer todo el ArrayList de paquetes y sumando sus pesos para luego devolver el peso total
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
		distancia+=new Random().nextInt(31) + 71;
		return distancia;
	}

	@Override
	public void incluirPaquete(Paquete paquete1) {
		/* se mira si el paquete existe y si el peso que tiene es positivo
		 * 				se contempla que pueda meterse mas de un paquete con el mismo nombre y peso
		*/
		if (paquete1 !=null && paquete1.getPeso()>0) {
			paquetes.add(paquete1);
		}
	}

}
