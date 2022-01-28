package Llamadas;

import java.util.ArrayList;
import java.util.Scanner;

public class GestiónLlamadas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> llamadas = new ArrayList<String>();
		int op = 1;
		int contador = 0;
		while (op > 0) {
			System.out.println("1. Aceptar llamada     0. Terminar llamada");
			op = sc.nextInt();
			if (op == 1 && contador < 10) {
				System.out.println("Quién eres?");
				String nombre = sc.next();
				llamadas.add(nombre);
			}else {
				op = 0;
			}
		sc.close();
			
		}
		System.out.println("Fin del programa\n");
		
		//Recorrido
		System.out.println("--Lista de llamadas--");
		for (int i = 0; i < llamadas.size(); i++) {
			System.out.println(llamadas.get(i));
			
		}

		if (llamadas.contains("Carol")) {
			System.out.println("Carol ha obtenido el premio");
		}else {
			System.out.println("Carol no ha obtenigo el premio");
		}
	}

}
