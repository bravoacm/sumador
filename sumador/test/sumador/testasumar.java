package sumador;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testasumar {

	@Test
	public void testunacifra() {
		asumar sumi = new asumar();
		String resultado = sumi.sumativo("5");
		assertEquals("5 = 5",resultado);
	}
	
	@Test
	public void testnegativo() {
		asumar nega = new asumar();
		String resultado = nega.sumativo("-1");
		assertNull(resultado);
	}
	
	@Test
	public void testvariascifras() {
		asumar varias = new asumar();
		String resultado = varias.sumativo("958");
		assertEquals("958 = 9+5+8=22",resultado);
	}

}
