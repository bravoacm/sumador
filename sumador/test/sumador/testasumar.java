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

}
