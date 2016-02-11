package ejerciciosDelTema;

public class Triangulo {
	//atributos
	private int A;
	private int B;
	private int C;
	
	/**
	 * @param A
	 * @param B
	 * @param C
	 * @throws IlegalTrianguloException 
	 */
	public Triangulo(int A, int B, int C) throws IlegalTrianguloException {
		if(trianguloValido(A, B, C)){
			this.A = A;
			this.B = B;
			this.C = C;
		}
		else throw new IlegalTrianguloException();
	}
	
	//metodo para comprobar si un triangulo es valido
	public boolean trianguloValido(int A, int B, int C){
		return A+B>C && A+C>B && B+C>A;
	}

	@Override
	public String toString() {
		return "Triangulo [A=" + A + ", B=" + B + ", C=" + C + "]";
	}
}
