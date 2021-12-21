import java.util.Scanner;

public class palindromo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número");
		int num = sc.nextInt();
		boolean control = true;
		String cad = String.valueOf(num);
		for (int i = 0, j= cad.length()-1; i < j; i++, j--) {
			if (cad.charAt(i)!= cad.charAt(j)) {
				control=false;
				break;
			}
		}
		if (control == false) {
			System.out.println("El número " + num + " no es capicua");
		}
		else {
			System.out.println("El número " + num + " no es capicua");
		}
		sc.close();
	}

}
