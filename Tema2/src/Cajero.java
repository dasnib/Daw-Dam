import java.util.Scanner;

public class Cajero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int saldo_inicial = (int) (Math.random() * ((10000 -100)+100));
		Scanner sc = new Scanner(System.in);
		System.out.println("1 - Sacar dinero");
		System.out.println("2 - Ingresar dinero");
		System.out.println("3 - Obtener saldo");
		System.out.println("Introduce el número equivalente a la operación que quieras realizar: ");
		int operacion = sc.nextInt();
		
		
		switch (operacion) {
		case 1:
			System.out.println("Escriba el saldo que quiera sacar:");
			int saldo_sacar = sc.nextInt();
			if ((saldo_sacar > saldo_inicial) & (saldo_sacar > 0)) {
				System.out.println("No es posible sacar una cantidad mayor o negativa de dinero a la que tienes en tu cuenta.");
			}
			else {
				System.out.println("Ha sacado " + saldo_sacar + "€ de su cuenta bancaria.");
				saldo_inicial -= saldo_sacar;
			}
			break;
		
		case 2:
			System.out.println("Escriba el saldo que quiere ingresar:");
			int saldo_ingresar = sc.nextInt();
			if (saldo_ingresar < 0) {
				System.out.println("No puede ingresar una cantidad negativa");
			}
			else {
				System.out.println("Ha ingresado " + saldo_ingresar + "€ en su cuenta bancaria.");
				saldo_inicial += saldo_ingresar;
			}
			break;
		
		case 3:
			System.out.println("El saldo en su cuenta es de " + saldo_inicial + "€");
			break;
		
		default:
			System.out.println("La operación introducida es erronea.");
			break;
		}		
		System.out.println("Fin del programa");
		sc.close();
	}
}
