package Ejemplos;

public class OperacionTestEquals {

	public static void main(String[] args) {
		OperacionSuma s = new OperacionSuma(4,5);
		OperacionResta r = new OperacionResta(4,5);
		if (s.equals(r)) {
			System.out.println("La operacion es igual");
		}else {
			System.out.println("La operacion no es igual");
		}
	}

}
