package ejerciciosDelTema;

import java.util.Scanner;

public class TestConversionHexBin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Introduce un numero en decimal");
		int numeroDecimal =in.nextInt();
		
		System.out.println(ConversionHexadecimal.numeroDecimal());
	}

}
