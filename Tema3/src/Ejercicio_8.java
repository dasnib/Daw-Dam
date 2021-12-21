
public class Ejercicio_8 {

	public static void main(String[] args) {
		for (int num=1, factorial=1; num<=10 ; num++) {
			for (int i=2; i<=num ;i++) {
				factorial *= i;
			}
			System.out.println("El factorial de " + num + " es:\t" + factorial);
			factorial = 1;
		}


	}

}
