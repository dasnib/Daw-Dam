
import java.util.Scanner;

public class calificaciones {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce el numero de notas que quieres introducir:");
		int notas = sc.nextInt();
		System.out.println("Introduce la nota de corte: ");
		float nota_corte = sc.nextFloat();
		
		int igualado = 0;
		int superado = 0;
		
		for (int i = 0; i < notas; i++) {
			System.out.println("Introduce una nota");
			float nota = sc.nextFloat();
			
			if (nota == nota_corte) {
				igualado += 1;
			}
			else if (nota > nota_corte) {
				superado += 1;
			}
		}
		System.out.println("Número de notas que han igualado la nota de corte: " + igualado);
		System.out.println("Número de notas que han superado la nota de corte: " + superado);
		sc.close();
	}
}
