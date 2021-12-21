import java.util.Scanner;

public class pruebaCuenta {

	public static void main(String[] args) {
		Cuenta c1 = new Cuenta("Pepe Perez Perales", 2000.78);
		System.out.println("MENU CUENTA BANCARIA\n");
		System.out.println("1. Ingresar    2. Retirar    3. Ver    4. Salir");
		Scanner sc = new Scanner(System.in);

		boolean seguir = true;

		while (seguir) {
			System.out.println("Qu� quieres hacer?");
			int opcion = sc.nextInt();
			
			switch (opcion) {
			case 1:
				System.out.println("Cu�nto desea ingresar?");
				double cantidad_ingresar = sc.nextDouble();
				c1.Ingresar(cantidad_ingresar);
				System.out.println("Operaci�n realizada");
				break;
				
			case 2:
				System.out.println("Cu�nto desea retirar?");
				double cantidad_retirar = sc.nextDouble();
				c1.Retirar(cantidad_retirar);
				System.out.println("Operaci�n realizada");
				break;
				
			case 3:
				System.out.println(c1);
				System.out.println("Operaci�n realizada");
				break;
				
			default:
				seguir = false;
				break;
			}
		}
		sc.close();
		System.out.println("Fin del programa");
		

	}

}
