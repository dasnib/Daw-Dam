import java.util.Scanner;

public class suma_inputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		int num1= sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2= sc.nextInt();
		System.out.println("Escribe el tercer número: ");
		int num3= sc.nextInt();
		sc.close();
		
		if ((num1<num2)&&(num2<num3)){
			System.out.println(num1 + " es el menor número");

		} 
		else if ((num2<num1)&&(num2<num3)){
			System.out.println(num2 + " es el menor número");
		}
		else {
			System.out.println(num3 + " es el menor número");
		}
	}
}