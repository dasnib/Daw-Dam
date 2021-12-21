import java.util.Scanner;

public class tabla_multiplicar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un número entero para hacer su tabla de multiplicar:");
		int numero = sc.nextInt();
		for (int tabla = 0 ;tabla < 11 ; tabla++) {
			System.out.println(tabla + " * " + numero + " = " + tabla * numero);
		}
		sc.close();
	}

}
