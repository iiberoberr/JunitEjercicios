package ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


class GenerarIpTest {

	/* Se crea un GenerarIp para testearlo
	 */
	GenerarIp target;
	
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		/* poner a target a nuevo para utilizarlo
		*/
		target = new GenerarIp();
	}
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}
	
	/* que se compruebe 1000 veces
	*/
	@RepeatedTest(1000)
	public void testGenerarNumero() {
		/* generar un numero y comprobar si está entre los párametros
		*/
		int numero = target.generarNumero();
	    assertTrue(numero > 0 && numero < 255, "El número generado está fuera del rango");
	}
	
	@Test
    public void testGeneraIp() {
		/* generar una ip y comprobar que ni empieza ni acaba por cero
		*/
        String ip = target.generarIp();
        boolean correcto = true;
        if (ip.lastIndexOf("0")==ip.length()-1 || ip.charAt(0)=='0') {
        	correcto=false;
        }
        assertTrue(correcto, "El número generado está fuera del rango");
    }


}
