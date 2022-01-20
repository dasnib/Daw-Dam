package Ejemplos;

public class OperacionPrueba {

	public static void main(String[] args) {
		OperacionSuma s1 = new OperacionSuma(3,4);
		System.out.println(s1);
		System.out.println("Resultado= "+ s1.operar() + "\n");
		
		OperacionResta r1 = new OperacionResta(7, 5);
		System.out.println(r1);
		System.out.println("Resultado= "+ r1.operar() + "\n");
		
		OperacionMultiplica m1 = new OperacionMultiplica(5, 4);
		System.out.println(m1);
		System.out.println("Resultado= " + m1.operar() + "\n");
		
		OperacionDivide d1 = new OperacionDivide(8, 4);
		System.out.println(d1);
		System.out.println("Resultado= " + d1.operar() + "\n");
		
	}

}
