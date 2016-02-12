package ejerciciosDelTema;

public class TestConversionHexBin {

	public static void main(String[] args) {
		try {
			System.out.println(ConversionHexBin.convertirBinarioADecimal("111"));
			try {
				System.out.println(ConversionHexBin.convertirHexadecimalABinario("1"));
			} catch (NoHexadecimalException e) {
				System.out.println("No es un numero hexadecimal");
			}
			catch (NoBinarioException e) {
			System.out.println("No es un numero binario");
		}
	}
	}
}

