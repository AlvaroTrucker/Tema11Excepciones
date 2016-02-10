package excepcionesPropias;

import java.util.Scanner;

public class TestComputadora {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce datos");
		while(in.hasNextLine()){
			String nombre = in.next();
			double hd = in.nextDouble();
			double ram = in.nextDouble();
			String mac = in.next();
			try {
				Computadora c = new Computadora(nombre, hd, ram, mac);
				System.out.println(c);
			} catch (NoMACCorrectaException e) {
				System.out.println("Direccion MAC erronea");
				
			}
		}

	}

}
