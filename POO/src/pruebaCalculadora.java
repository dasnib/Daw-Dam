import java.util.Scanner;

public class pruebaCalculadora {

	public static void main(String[] args) {
		Calculadora c = new Calculadora(0, 0);

		int n1, n2;
		int opcion = 0;
		do {
			System.out.println();
			System.out.println("1. Sumar   2.Restar   3.Multiplicar   4.Salir");
			Scanner sc = new Scanner(System.in);
			opcion = sc.nextInt();
			if (opcion>0 && opcion<4) {
				
				n1 = (int)(Math.random()*100);
				n2 = (int)(Math.random()*100);
				
				c.setOp1Op2(n1, n2);
				System.out.println(c.toString());
			}
			sc.close();
			
			switch (opcion) {
				case 1:
					System.out.println("Suma: " + c.resta());
					break;
				case 2:
					System.out.println("Resta: " + c.resta());
					break;
				case 3:
					System.out.println("Multiplicacion: " + c.multiplicacion());
					break;
				default:
					opcion = 4;
			}
		} while (opcion != 4);
		System.out.println("Fin del programa");

	}

}
