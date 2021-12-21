

import java.util.Scanner;

public class Rectángulo_asteriscos {
	public static void mostrar_rectangulo(int ancho, int altura) {
		for (int i = 0; i < altura; i++) {
			for (int j = 0; j < ancho; j++) {
				System.out.print("* ");
				if (j==ancho-1) {
					System.out.println("*");
				}
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el ancho del rectángulo");
		int ancho = sc.nextInt();
		System.out.println("Escribe la altura del rectángulo");
		int altura = sc.nextInt();

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("---- Rectángulo de " + ancho + "x" + altura + " ----");
		System.out.println();
		mostrar_rectangulo(ancho, altura);
		sc.close();
	}

}
