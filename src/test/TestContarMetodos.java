package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.ContarMetodos;
import dev.ILeer;

public class TestContarMetodos {
	ILeer cuentaMetodos = new ContarMetodos();
	String dirPath = "C:\\Users\\sebas\\eclipse-workspace\\Composite\\src\\Circulo.java";

	@Test
	public void testContarArchivos() {
		double resultadoObservado = cuentaMetodos.Contar(dirPath);
		double resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoObservado, 0.01);
	}
}
