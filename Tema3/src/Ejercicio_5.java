import java.util.Scanner;

public class Ejercicio_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un n�mero y se mostrar�n sus divisores:");
		int num = sc.nextInt();
		System.out.println("Los divisores son:");
		for (int i= 1; i<=(num/2)  ;i++) {
			if ((num%i == 0)) {
				System.out.print(i + " | ");
			}
		}
		sc.close();
	}
}