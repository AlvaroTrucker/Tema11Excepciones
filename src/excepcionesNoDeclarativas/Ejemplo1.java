package excepcionesNoDeclarativas;

public class Ejemplo1 {

	public static void main(String[] args) {
		//excepcion aritmetica
		int numerador = 100;
		int denominador = 0;
		
		//comprobamos que el denominador no sea cero antes
		//de hacer la operacion, evitando una excepcion aritmetica
		if (denominador != 0){
			int resultado = numerador/denominador;
		}
	}
}
