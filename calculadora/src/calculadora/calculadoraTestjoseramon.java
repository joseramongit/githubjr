package calculadora;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTestjoseramon {

	@Test
	public void testSuma() {
		int res = calculadora.suma(10, 20);
		assertEquals(30,  res);

		
		//fail("Not yet implemented");
	}

	@Test
	public void testResta() {
		int res = calculadora.resta(20, 10);
		assertEquals(10,  res);
		//fail("Not yet implemented");
	}

	@Test
	public void testMultiplicacio() {
		int res = calculadora.multiplicacio(20, 10);
		assertEquals(200,  res);
		
		//fail("Not yet implemented");
	}
	

	@Test
	public void testDivisio() {
		int res = calculadora.divisio(20, 2);
		assertEquals(10,  res);
		//fail("Not yet implemented");
	}
	

	@Test (expected = java.lang.ArithmeticException.class)
	public void testDivideix() {
		int res = calculadora.divideix(10, 0);
		assertEquals("Ha fallat el método divideix", 2,  res);
	}

             }




