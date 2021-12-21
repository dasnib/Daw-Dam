
public class Ejercicio_1 {

	public static void main(String[] args) {
		boolean iguales;
		int num;
		int num_anterior = (int) (Math.random() * 2);
		int bucle = 0;
		System.out.print(num_anterior + " | ");
		for (iguales = true ; bucle < 10 ; bucle++) {
			num = (int) (Math.random() * 2);
			System.out.print(num + " | ");
			if (num_anterior == num) {
				iguales = true;
			}
			else {
				iguales = false;
				System.out.println();
				System.out.println("Los números no son iguales");
				break;
			}
		}
		if (iguales==true) {
			System.out.println();
			System.out.println("Los número son iguales");
		}
	}
}
