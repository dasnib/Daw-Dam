package Ejemplos;

import java.util.Scanner;

public class OperacionCalculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("---- Calculadora Universal ----\n");
		int op;
		double valor1, valor2;
		do {
			System.out.println("Introduce el primer valor:");
			valor1 = sc.nextDouble();
			System.out.println("Introduce el segundo valor:");
			valor2 = sc.nextDouble();
			System.out.println("Qué quieres hacer?");
			System.out.println("1.Sumar    2.Restar    3.Multiplicar    4.Dividir");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				OperacionSuma s = new OperacionSuma(valor1, valor2);
				System.out.println(s.operar());
				break;
				
			case 2:
				OperacionResta r = new OperacionResta(valor1, valor2);
				System.out.println(r.operar());
				break;
			
			case 3:
				OperacionMultiplica m = new OperacionMultiplica(valor1, valor2);
				System.out.println(m.operar());
				break;
			
			case 4:
				OperacionDivide d = new OperacionDivide(valor1, valor2);
				System.out.println(d.operar());
				break;
				
			default:
				System.out.println("Operacion introducida incorrecta, Fin del Programa");
			}
			System.out.println();
		} while (op>= 0 && op<5);
		sc.close();

	}

}
