
public class Ejercicio_2 {

	public static void main(String[] args) {
		float suma = 0;
		int num;
		for (int bucle = 0; bucle < 20; bucle++) {
			num = (int) (Math.random() * 100);
			suma +=  num;
		}
		float media = suma / 20;
		
		System.out.println("La media de los 20 números es: " + media);
	}
	
}