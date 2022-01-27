package Notas;

import java.util.Scanner;

public class BlocNotas extends Nota{
	private Nota[] listaNotas;
	private int numero;
	
	public BlocNotas(int numero) {
		super(1, "");
		this.numero = numero;
		listaNotas = new Nota [numero];
	}
	
	public void rellenarBloc () {
		Scanner sc = new Scanner(System.in);
		int contador = -1;
		while (contador < 0 || contador > numero) {
			System.out.println("Cuantas notas quieres introducir?");
			contador = sc.nextInt();
		}
		
		for (int i = 0; i < contador; i++) {
			System.out.println("Introduce el identificador de la nota");
			int identificador = sc.nextInt();
			if (identificador>=numero | identificador <0) {
				System.out.println("Identificador incorrecto");
				i--;
			}
			else {
				System.out.println("Introduce el texto");
				String texto = sc.next();
				listaNotas[identificador] = new Nota(identificador, texto);
			}
			
		}
	}
	
	public void listarNotas () {
		for (Nota nota : this.listaNotas) {
			//if (nota != null) {
				//System.out.println(nota);
			//}
			System.out.println(nota);
		}
	}
	
	public void borrarNota() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la nota que quieres borrar");
		int iden = sc.nextInt();
		if (iden > 0 || iden < numero) {
			listaNotas[iden]=null;
		}
		else {
			System.out.println("No existe la nota introducida");
		}
	}
	
	public int numNotas () {
		int contador = 0;
		for (Nota nota : listaNotas) {
			if (nota != null) {
				contador += 1;
			}
		}
		return contador;
	}
	
}
