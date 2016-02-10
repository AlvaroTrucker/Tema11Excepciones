package excepcionesDeclarativas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo4 {
	//devuelve la primera palabra de un fichero
	//de una longitud dada
	public static String buscarPalabra(File inFile, int longitud) throws FileNotFoundException{
		String palabra = "";
		Scanner in = new Scanner(inFile);
		String auxiliar = in.nextLine();
		while(in.hasNextLine()){
			if(auxiliar.length()==longitud){
				palabra = auxiliar;
				break;
			}
		}
		return palabra;
	}
}
