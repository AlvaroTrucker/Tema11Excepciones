package excepcionesNoDeclarativas;

import java.util.Scanner;

public class Ejemplo3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Leer un entero y un decimal: ");
		String enteroCadena = sc.next();
		int entero = 0;
		double decimal = 0;
		if (enteroCadena.matches("[\\d]+"))
			entero = Integer.parseInt(enteroCadena);
		
		String doubleCadena = sc.next();
		if (doubleCadena.matches("[\\d]+(\\.[\\d]+)?")){
			decimal = Double.parseDouble(doubleCadena);
		}
		sc.close();
		System.out.println("Entero: "+entero);
		System.out.println("Decimal: "+decimal);
	}
}
