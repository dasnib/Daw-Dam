
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		int [] lista = new int [10];
		int contador = 0;
		Scanner sc = new Scanner(System.in);
		while (contador < lista.length) {
			System.out.println("Escribe un número, si se repiten no cuentan, te quedan " + (10-contador));
			int numero = sc.nextInt();
			boolean numero_en_lista = false;
			for (int i = 0; i < lista.length; i++) {
				if (lista[i] == numero) {
					numero_en_lista = true;
					break;
				}
			}
			if (!numero_en_lista) {
				lista[contador] = numero;
				contador += 1;
			
			}
		}

		System.out.println();
		System.out.println("Estos son los 10 números diferentes introducidos");
		System.out.println();
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " | ");
		}
		sc.close();
		
	}
}
