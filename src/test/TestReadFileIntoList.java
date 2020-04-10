package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import dev.ILeer;
import dev.ReadFileIntoList;

public class TestReadFileIntoList {
	ILeer lector = new ReadFileIntoList();
	String dirPath = "C:\\Users\\sebas\\eclipse-workspace\\PSP1\\src\\dev\\ILeer.java";

	@Test
	public void testContarLoc() {
		double resultadoObservado = lector.Contar(dirPath);
		double resultadoEsperado = 3;
		assertEquals(resultadoEsperado, resultadoObservado, 0.01);
	}
}
