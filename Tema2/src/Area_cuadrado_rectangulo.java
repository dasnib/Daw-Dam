import java.util.Scanner;

public class Area_cuadrado_rectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Escriba 1 si quiere calcular el �rea de un rect�ngulo o 2 si quiere la de un cuadrado: ");
		int tipo_area= sc.nextInt();
		
		if (tipo_area==1) {
			System.out.println("Intrduce la base: ");
			double base= sc.nextDouble();
			System.out.println("Introduce la altura; ");
			double altura= sc.nextDouble();
			System.out.println("El �rea del rect�ngulo es: "+(base*altura)+" u�");
		}
		else {
			System.out.println("Introduce el lado: ");
			double lado=sc.nextDouble();
			System.out.println("El �rea del cuadrado es: " +(lado*lado)+ " u�");
		}
		sc.close();
		
	}
}
