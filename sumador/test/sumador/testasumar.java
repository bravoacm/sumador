package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Clase Test JUnit
 * @author Adrian Bravo
 * @version 1.0
 *
 */

class testasumar {

	/**
	 * Test 1 - comprueba un numero de un solo digito
	 */

	@Test
	public void testunacifra() {
		asumar sumi = new asumar();
		String resultado = sumi.sumativo("5");
		assertEquals("5 = 5",resultado);
	}
	
	/**
	 * Test 2 - comprueba si el numero es negativo
	 */
	
	@Test
	public void testnegativo() {
		asumar nega = new asumar();
		String resultado = nega.sumativo("-1");
		assertNull(resultado);
	}
	
	/**
	 * Test 3 - resultado de la suma de un número con varias cifras
	 */
	
	@Test
	public void testvariascifras() {
		asumar varias = new asumar();
		String resultado = varias.sumativo("958");
		assertEquals("958 = 9+5+8=22",resultado);
	}

}
