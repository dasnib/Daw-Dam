
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un numero para saber el numero de fibonacci en esa posicion:");
		int num = sc.nextInt();
		num = Math.abs(num);
		int aux;

		int  num1=0, num2=1;
		for (int i = 0; i < num; i++) {
			System.out.print(num2 + "  ");
			aux = num1 + num2;
			num1 = num2;
			num2 = aux;

		}
		sc.close();
	}
}
