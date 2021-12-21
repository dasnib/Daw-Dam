package Ejercicio2;

import java.util.Scanner;

public class NombresPrueba2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op=1;
		Nombres l1 = new Nombres(3);
		int numero;
		System.out.println("Tienes una lista de " + l1.maxNombres() + " elementos");
		while (op<6) {
			System.out.println("1.añadir    2.eliminar    3.ver    4.dar posicion    5.vaciar lista    6.salir");
			op = sc.nextInt();
			switch (op) {
				case 1:
					System.out.println("Introduce un nombre");
					String nuevoNombre = sc.next().toLowerCase();
					if (l1.agregarNombre(nuevoNombre) == 1) {
						System.out.println("Su nombre está añadido");
					}
					else {
						System.out.println("No se ha podido añadir el nombre");
					}
					break;
					
				case 2:
					System.out.println("Introduce un nombre a eliminar");
					nuevoNombre = sc.next().toLowerCase();
					if (l1.eliminar(nuevoNombre)) {
						System.out.println("Su nombre se ha eliminado");
					}
					else {
						System.out.println("No se ha podido eliminar el nombre");
					}
					break;
					
				case 3:
					l1.verListaActual();
					break;
				
				case 4:
					System.out.println("Dame un numero");
					numero = sc.nextInt();
					System.out.println(l1.stringMostrarInt(numero));
					break;
					
				case 5:
					l1.vaciar();
					
			}
		}
		System.out.println("Fin del programa");
		sc.close();

	}

}
