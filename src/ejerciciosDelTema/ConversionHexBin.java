package ejerciciosDelTema;

public class ConversionHexBin {
	public static int convertirBinarioADecimal(String binario) throws NoBinarioException{
		int decimal = 0;
		if(esBinario(binario)){
			//le damos la vuelta al String
			String valor = new StringBuilder(binario).reverse().toString();
			int suma = 0;
			for (int i = 0; i < valor.length(); i++) {
				decimal += Math.pow(2, i)*Character.getNumericValue(valor.charAt(i));
			}
		}
		else throw new NoBinarioException();
		return decimal;
	}
	
	public static int convertirHexadecimalABinario(String hexadecimal) throws NoHexadecimalException{
		int decimal = 0;
		if(esHexadecimal(hexadecimal)){
			String valor = new StringBuilder(hexadecimal).reverse().toString();
			for (int i = 0; i < valor.length(); i++) {
				switch(valor.charAt(i)){
				case 'A':
					decimal += Math.pow(16, i)*10;
					break;
				case 'B':
					decimal += Math.pow(16, i)*11;
					break;
				case 'C':
					decimal += Math.pow(16, i)*12;
					break;
				case 'D':
					decimal += Math.pow(16, i)*13;
					break;
				case 'E':
					decimal += Math.pow(16, i)*14;
					break;
				case 'F':
					decimal += Math.pow(16, i)*15;
					break;
				}
			}
		}
		else throw new NoHexadecimalException();
		return 0;
	}
	
	private static boolean esBinario(String binario){
		return binario.matches("[01]+");
	}
	
	private static boolean esHexadecimal(String hexadecimal){
		return hexadecimal.matches("[0-9A-F]+");
	}
}