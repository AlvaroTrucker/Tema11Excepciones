package ejerciciosDelTema;

public class ConversionHexadecimal {
	public static String numeroDecimal(){
		int numeroDecimal = 1;
		int numeroDecimal1 = 1;
		String letras = "";
		char numerosHex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(numeroDecimal > 0){
			numeroDecimal1 = numeroDecimal%16; 
			letras=numerosHex[numeroDecimal1]+letras; 
			numeroDecimal1=numeroDecimal1/16;
	     }
		return letras;
	}

}
