package dev;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ContarArchivos implements ILeer {

	private List<String> Archivos = new ArrayList<>(); // arreglo de archivos

	public String getArchivos(Integer index) {
		return Archivos.get(index);
	}

	@Override
	public int Contar(String dirPath) {
		int count = 0; // contador es necesario que se inicialice en la funcion
		File f = new File(dirPath);
		File[] files = f.listFiles(); // manera de ller archivos

		if (files != null) { // solo si el archivo es diferente de null
			for (File file : files) { // recorre todos los archivos
				count++; // contador
				if (file.isDirectory()) {
					Contar(file.getAbsolutePath());
				}
			}
		}

		for (File file : files) {
			Archivos.add(file.getPath()); // agrega el path a el arreglo
		}

		return count; // retorna contador
	}
}