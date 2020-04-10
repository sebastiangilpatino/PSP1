package dev;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner myObj = new Scanner(System.in); // Lectura de la ruta
		System.out.println("Ingresa la ruta: ");
		String dirPath = myObj.nextLine();
		// ejemplo de ruta
		// String dirPath = "C:\\Users\\sebas\\eclipse-workspace\\PSP1\\src\\dev";
		myObj.close(); // cierra lectura teclado

		ILeer archivos = new ContarArchivos(); // creacion de las clases cuenta archivos
		ILeer lector = new ReadFileIntoList(); // creacion de las clases cuenta LOC
		ILeer cuentaMetodos = new ContarMetodos(); // creacion de las clases cuenta metodos

		int noArchivos = archivos.Contar(dirPath); // cuenta # archivos
		int[] contadorLOC = new int[noArchivos]; // crea arreglo contador de lineas
		int contadortotal = 0; // contador total de lineas se inicializa

		for (int i = 0; i < noArchivos; i++) {
			contadorLOC[i] = lector.Contar(((ContarArchivos) archivos).getArchivos(i)); // cuenta lo archivos y los
																						// ingresa al arreglo
			contadortotal += contadorLOC[i]; // suma el contador total
			System.out.println(i + ":  " + ((ContarArchivos) archivos).getArchivos(i) + "   LOC: " + contadorLOC[i]
					+ "  No Metodos: " + cuentaMetodos.Contar(((ContarArchivos) archivos).getArchivos(i))); // imprime
																											// los datos
		}
		System.out.println("No total de lineas:  " + contadortotal); // imprime datos

	}
}