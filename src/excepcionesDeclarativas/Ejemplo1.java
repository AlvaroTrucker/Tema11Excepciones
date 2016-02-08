package excepcionesDeclarativas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejemplo1 {
	public static void main(String[] args) {
		File inFile = new File("uno.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(inFile);
			int numeroABuscar = 0;
			String leido;
			while(sc.hasNext()){
				leido = sc.next();
				if (leido.matches("[\\d]+"))
					numeroABuscar = Integer.parseInt(leido);
			}
			System.out.println("El valor doble del numero encontrado es: "+numeroABuscar*2);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("EL fichero no existe");
		}
		finally {
			if (sc != null)
				sc.close();
			System.out.println("Bloque finally");
		}
	}
}
