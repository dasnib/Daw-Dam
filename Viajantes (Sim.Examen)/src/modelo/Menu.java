package modelo;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		Departamento d1 = new Departamento();
		System.out.println("--- Viajes ---\n\n");

		Scanner sc = new Scanner(System.in);
		int op = 1;

		while (op != 5) {
			System.out.println("1.añadir viajante   2.añadir viaje.   3.ver mejor viajante.   4 ver dto.   5 salir\n");
			System.out.println("Introduce una opción:");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Introduce el nombre del viajante que quiere agregar");
				String nombre = sc.next();
				Viajante v1 = new Viajante(nombre);
				d1.agregarViajante(v1);
				break;

			case 2:
				System.out.println("Introduce la ciudad que desea agregar");
				String ciudad = sc.next();
				System.out.println("Introduce el nombre del viajante que ha visitado la ciudad");
				String nombre2 = sc.next();
				d1.agregarViaje(ciudad, nombre2);
				break;

			case 3:
				d1.mostrarNivelAlto();
				break;

			case 4:
				System.out.println(d1);
				break;

			case 5:
				System.out.println("Fin del programa");
				break;

			default:
				System.out.println("La opción introducida es incorrecta\n");
				break;
			}

		}
		sc.close();
	}

}
