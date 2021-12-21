
public class Ejercicio_10 {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Los números primos comprendidos entre el 1 y el 100 son:\n");
		for (int num = 2 ; num<=100 ; num++) {
			boolean primo = true;
			for (int i= num/2 ; i>1 ; i--) {
				if (num%i == 0) {
					primo = false;
				    break;
				}
			}
			if (primo == true) {
				System.out.print(" " + num + " |");
			}
		}

	}
}
