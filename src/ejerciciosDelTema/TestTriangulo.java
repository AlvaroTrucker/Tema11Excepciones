package ejerciciosDelTema;

public class TestTriangulo {

	public static void main(String[] args) {
		try {
			Triangulo t = new Triangulo(1, 2, 2);
			System.out.println(t);
		} catch (IlegalTrianguloException e) {
			// TODO Auto-generated catch block
			System.out.println("Triangulo no válido");
		}
	}

}
