
public class Ejercicio_4 {

	public static void main(String[] args) {
		int num;
		float suma = 0;
		for (int bucle = 0, primero = 0, ultimo = 0; bucle < 9; bucle++) {
			num = (int) (Math.random() * 10);
			System.out.print(num + " | ");
			suma += num;
			if (bucle == 0) {
				primero = num;
			}
			else if (bucle == 8) {
				ultimo = num;
				if (primero == ultimo) {
					System.out.println("");
					System.out.println("El primer número (" + primero + ") y el último número (" + ultimo + ") son iguales");
					System.out.println("La media es: " + suma/9);
				}
				else {
					System.out.println("");
					System.out.println("El primer número (" + primero + ") y el último número (" + ultimo + ") no son iguales");
				}
			}
		}
	}
}