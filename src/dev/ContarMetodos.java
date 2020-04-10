package dev;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class ContarMetodos implements ILeer {

	@Override
	public int Contar(String dirPath) {
		int contador = 0; // inicializa contador es necesario que sea en la funcion
		List<String> lines = Collections.emptyList(); // crea el arreglo vacio

		try {
			lines = Files.readAllLines(Paths.get(dirPath), StandardCharsets.UTF_8); // forma de leer las lineas de un
																					// archivo
		}

		catch (IOException e) {

			// do something
			e.printStackTrace();
		}

		for (String line : lines) { // recorre las lineas y con ciertas condiciones decide que se cuenta y que no
			if (line.contains("public") && line.contains("(") && line.contains(")") && line.contains("{")) {
				contador++;
			} else if (line.contains("private") && line.contains("(") && line.contains(")") && line.contains("{")) {
				contador++;
			}
		}

		return contador;
	}

}
