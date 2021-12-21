import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para calcular su factorial:");
		int num = sc.nextInt();
		int factorial = 1;
		for (int i=2; i<=num ;i++) {
			factorial *= i;
		}
		System.out.println("El factorial de " + num + " es: " + factorial);
		sc.close();
	}
}
