package excepcionesNoDeclarativas;

import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		//excepciones originadas con Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Leer un entero: ");
		int entero = sc.nextInt();
		sc.close();
	}
}