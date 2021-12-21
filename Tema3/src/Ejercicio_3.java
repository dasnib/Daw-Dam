
public class Ejercicio_3 {

	public static void main(String[] args) {
		int mayor = 0;
		int repetido = 0;
		for (int bucle = 0; bucle < 40; bucle++) {
			int num = (int) (Math.random() * 50);
			System.out.print(num + " | ");
			if (num > mayor) {
				mayor = num;
				repetido = 0;
			}
			else if (num == mayor) {
				repetido += 1;
			}

		}
		System.out.println("");
		System.out.println("El número mayor es: " + mayor);
		System.out.println("El número se ha repetido: " + repetido + " veces");
	}
}
