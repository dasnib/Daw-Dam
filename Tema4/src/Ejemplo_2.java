import java.util.Scanner;

public class Ejemplo_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Cuantos elementos quieres:");
		size = sc.nextInt();
		int[] numeros = new int[Math.abs(size)];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("into valor:");
			numeros[i] = sc.nextInt();
		}
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
		System.out.println();
		sc.close();
	}

}
