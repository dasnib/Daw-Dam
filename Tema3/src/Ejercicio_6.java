
public class Ejercicio_6 {

	public static void main(String[] args) {
		System.out.println("Tabla de multiplicar\n");
		System.out.print("\t|");
		for (int num=1; num<=10 ; num++) {
			System.out.print("   " + num + " \t|");
		}
		System.out.println("");
		System.out.println("_________________________________________________________________________________________");
		for (int num = 1; num<=10 ; num++) {
			System.out.print("   " + num + " \t|");
			for (int num_2=1; (num<=10 & num_2<=10) ; num_2++) {
				if(num*num_2==100) {
					System.out.print("   " + num*num_2 + " |");
					break;
				}
				System.out.print("   " + num*num_2 + " \t|");
			}
			System.out.println("");
		}
	}
}
