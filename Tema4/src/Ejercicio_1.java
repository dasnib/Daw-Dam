
import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int [10];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Introduce 10 números, te faltan " + (10-i));
			numeros[i] = sc.nextInt();
		}
		for (int i = numeros.length-1; i >-1; i--) {
			System.out.println(numeros[i]);
		}
		sc.close();
	}

}
