import java.util.Scanner;

public class numeros_pares_impares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer n�mero:");
		int num1 = sc.nextInt();
		System.out.println("Escribe el segundo n�mero:");
		int num2 = sc.nextInt();
		sc.close();
		
		if ((num1 % 2 !=0) && (num2 % 2 !=0)) {
			System.out.println("Los dos n�meros son impares");
		}
		else if ((num1 % 2 ==0) && (num2 % 2 ==0)) {
			System.out.println("Los dos n�meros son pares");
		}
		else if (num1 % 2 ==0) {
			System.out.println("El primer n�mero es par y el segundo impar");
		}
		else {
			System.out.println("El primer n�mero es impar y el segundo par");
		}
		
	}
}
