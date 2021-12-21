
import java.util.Scanner;

public class Ej_6_String {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe una cadena de caracteres");
		String cad = sc.nextLine();
		cad = cad.toLowerCase();
		String vocales = "aeiou";
		int contador = 0;
		
		for (int letra = 0; letra < cad.length(); letra++) {
			if (vocales.indexOf(cad.charAt(letra))>-1) {
				contador ++;
			}
		}
		System.out.println("La cadena " + cad + " tiene " + contador + " vocales");
		sc.close();
	}

}
