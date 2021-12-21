import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba la temperatura actual:");
		int temp = sc.nextInt();
		
		if (temp < 10) {
			System.out.println("Usted está en un clima frío");
		}
		else if ((10 <= temp) & (temp <= 25)) {
			System.out.println("Usted está en un clima templado");
		}
		else if ((26 <= temp) & (temp <= 35)) {
			System.out.println("Usted está en un clima caluroso");
		}
		else {
			System.out.println("Usted está en un clima tropical");
		}
		System.out.println("Fin del programa");
		sc.close();
	}

}
