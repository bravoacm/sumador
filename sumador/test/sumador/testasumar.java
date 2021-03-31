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

}
