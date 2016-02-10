package excepcionesDeclarativas;

import java.io.File;
import java.io.FileNotFoundException;

public class TestEjemplo4 {

	public static void main(String[] args) {
		int longitud = 5;
		File inFile = new File("/home/matinal/Descargas/nombres_mujer.txt");
		try {
			String nombreBuscado = Ejemplo4.buscarPalabra(inFile, longitud);
			System.out.println("Nombre buscado: "+nombreBuscado);
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		}
	}
}
