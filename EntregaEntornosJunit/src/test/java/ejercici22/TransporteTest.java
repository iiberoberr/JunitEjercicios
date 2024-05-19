/**
 * 
 */
package ejercici22;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * 
 */
class TransporteTest {
	/* se cera una camioneta para testear
	 */
	Camioneta target;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		/* ponemos anueva la camioneta que se va a testear
		 */
		target=new Camioneta();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testPesoTotal() {
		/* crea un paquete, lo añade, y testea el peso total
		*/
		Paquete paquete1 = new Paquete("Mendillorri", 20f);
        target.incluirPaquete(paquete1);
        float actual = target.pesoTotal();
        float expected = 20f;
        assertEquals(actual,expected,"El metodo pesoTotal devuelve un valor erroneo");
		
	}

	@Test
	void testRecorrerDistancia() {
		/* comrobar que el valor al azar que crea está entre 70 y 100
		*/
		boolean excepted=true;
		int azar=target.recorrerDistancia();
		if (azar>100 || azar<70) {
			excepted=false;
		}

		assertTrue(excepted,"El metodo recorrerDistancia devuelve un valor erroneo");
	}
}
