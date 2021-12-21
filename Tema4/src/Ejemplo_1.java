import java.util.Scanner;

public class Ejemplo_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Cuantos elementos quieres en el array:");
		int size = sc.nextInt();
		int[] numeros = new int [Math.abs(size)];
		for (int i = 0; i < numeros.length; i++) {
			numeros [i]= i *i ;
			System.out.print(numeros[i] + " | ");
		}
		System.out.println();
		sc.close();
	}

}