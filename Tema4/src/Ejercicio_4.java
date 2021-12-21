import java.util.Scanner;

public class Ejercicio_4 {

	public static void main(String[] args) {
		//crea lista de 100 numeros entre el 1 y 100
		int [] lista = new int [100];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)(Math.random()*100+1);
		}
		//pide un numero entre el 1 y 100 al usuario
		Scanner sc = new Scanner(System.in);
		int numero = 1;
		do {
			System.out.println("Escribe un número entero entre el 0 y 100");
			numero = sc.nextInt();
		//comprueba si el numero está en la lista y en qué posición
		} while ((numero<=0)&(numero>=100));

		boolean numero_en_lista = false;
		int posicion = 0;
		for (int i = 0; (i < lista.length)&(numero_en_lista==false); i++) {
			if (numero == lista[i]) {
				numero_en_lista = true;
			}
			posicion = i+1;
		}
		if (numero_en_lista) {
			System.out.println("El número introducido está en la lista, en la posición: " + posicion);
		}
		else {
			System.out.println("El número introducido no está en la lista");
		}
		sc.close();
		
	}

}
