import java.util.Scanner;

public class Ej_5_string {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int posicion;
		System.out.println("Introduce una cadena");
		String cad = sc.nextLine();
		do {
			posicion = cad.indexOf(" ");

			if (posicion > -1) {
					System.out.println(cad.substring(0, posicion));
					cad = cad.substring(posicion + 1);
			}
		} while (posicion != -1);
		System.out.println(cad);
		sc.close();
	}

}
