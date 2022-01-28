package Notas;

public class PruebaIgual {

	public static void main(String[] args) {
		Nota n1 = new Nota(1, "hola");
		Nota n2 = new Nota(1, "hola");
		
		if (n1.getTexto().equals(n2.getTexto()) & n1.getIdentificador()==n2.getIdentificador()) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}
	}

}
