import java.util.Scanner;

public class Ejercicio_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float factura = 0;
		int unidades;
		do {
			unidades = 0;
			float precio;
			System.out.println("Introduce las unidades:");
			unidades = sc.nextInt();
			System.out.println("Introduce el precio");
			precio = sc.nextFloat();
			float costo = unidades * precio;
			factura += costo;

	
		}while(unidades!=0);
		if (factura > 1000) {
			float descuento = 1000 * 5 / 100;
			factura -= descuento;
			System.out.println("La factura de tu compra es de: " + factura + " €");
		}
		else {
			System.out.println("La factura de tu compra es de: " + factura + " €");
		}
		sc.close();
	}
}
