package Notas;

import java.util.Scanner;

public class NotaPrueba {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("---- BLOC DE NOTAS ----\n");
		int tam = -1;
		
		while (tam <= 0) {
			System.out.println("Introduce el tamaño de la lista de notas");
			tam = sc.nextInt();
		}
		
		BlocNotas bn1 = new BlocNotas(tam);
		int op=0;
		
		do {
			System.out.println("Qué quieres hacer?");
			System.out.println("1.Rellenar lista    2.Ver lista    3.Borrar nota    4.Ver longitud lista    5.Salir");
			op = sc.nextInt();
			
			switch (op) {
			case 1:
				bn1.rellenarBloc();
				break;
				
			case 2:
				bn1.listarNotas();
				break;
			
			case 3:
				System.out.println("");
				bn1.borrarNota();
				break;
			
			case 4:
				System.out.println(bn1.numNotas());
				break;
				
			case 5:
				System.out.println("Fin");
				break;
				
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			System.out.println();
		} while (op!=5);
		sc.close();

	

	}

}
