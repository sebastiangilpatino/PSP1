package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.ContarArchivos;
import dev.ILeer;

public class TestContarArchivos {

	ILeer archivos = new ContarArchivos();
	String dirPath = "C:\\Users\\sebas\\eclipse-workspace\\PSP1\\src\\dev";

	@Test
	public void testContarArchivos() {
		double resultadoObservado = archivos.Contar(dirPath);
		double resultadoEsperado = 5;
		assertEquals(resultadoEsperado, resultadoObservado, 0.01);
	}
}
