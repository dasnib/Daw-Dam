import java.util.Scanner;

public class Ejercicio_9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un n�mero para saber si es primo:");
		int num = sc.nextInt();
		boolean primo = true;
		for (int i= num/2 ; i>1 ; i--) {
			if ((num%i == 0)) {
				System.out.println(num + " no es un n�mero primo");
				primo = false;
			    break;
			}
		}
		if ((primo == true) & (num > 1)) {
			System.out.println(num + " es un n�mero primo");
		}
		else if(num < 1){
			System.out.println(num + " no es un n�mero primo");
		}
		sc.close();

	}
}
