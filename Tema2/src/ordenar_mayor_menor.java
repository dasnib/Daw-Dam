import java.util.Scanner;

public class ordenar_mayor_menor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe el primer número: ");
		int num1= sc.nextInt();
		System.out.println("Escribe el segundo número: ");
		int num2= sc.nextInt();
		System.out.println("Escribe el tercer número: ");
		int num3= sc.nextInt();
		int aux;
		sc.close();
		
		if ((num1<num2)&&(num1<num3)){
			aux = num3;
			num3 = num1;
			if (aux<num2) {
				num1 = num2;
				num2 = aux;
			}
			else {
				num1 = aux;
			}
			
		} 
		else if ((num2<num3)){
			aux = num3;
			num3 = num2;
			if (num1<aux) {
				num2 = num1;
				num1 = aux;
			}
			else {
				num2 = aux;
			}
		}
		else if (num2 > num1) {
			aux = num1;
			num1 = num2;
			num2 = aux;
		}
		System.out.println("El orden de mayor a menor es: " + num1 + " , " + num2 + " , " + num3);
		
	}

}