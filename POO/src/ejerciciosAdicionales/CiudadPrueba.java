package ejerciciosAdicionales;

import java.util.Arrays;
import java.util.Scanner;

public class CiudadPrueba {

	public static void main(String[] args) {
		Ciudad c1 = new Ciudad("Madrid", 43.0, 2.0);

		System.out.println("Elige una opcion:");
		System.out.println("1. Registra temp	2. Temp minima	3.Temp maxima	4. Minimas	5.Maximas");

		Scanner sc = new Scanner(System.in);
		System.out.println("Eliga la que realizar");
		int opcion = sc.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Dame una temperatura");
			double temp = sc.nextDouble();
			System.out.println("Dame un  mes");
			int mes = sc.nextInt();
			c1.registrarTemperatura(mes, temp);
			System.out.println("Temperatura registrada");
			break;

		case 2:
			System.out.println("La temperatura m�nima del a�o es: " + c1.minimaGeneral());
			break;

		case 3:
			System.out.println("La temperatura m�xima del a�o es: " + c1.maximaGeneral());
			break;

		case 4:
			System.out.println("Las temperaturas m�nimas de cada mes del a�o son: " + Arrays.toString(c1.getMinimas()));
			break;

		case 5:
			System.out.println("Las temperaturas m�ximas de cada mes del a�o son: " + Arrays.toString(c1.getMaximas()));
			break;
		}
		sc.close();

	}

}
