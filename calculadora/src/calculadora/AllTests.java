package calculadora;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ SumaCalculadoraTest.class, TestCalculadoraDivisio.class, TestCalculadoraMultiplicacion.class,
		TestCalculadoraResta.class })
public class AllTests {

}
