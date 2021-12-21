import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la cantidad total de preguntas que había en el test:");
		double preguntas_totales = sc.nextInt();
		System.out.println("Ingresa la cantidad de preguntas que ha acertado:");
		double preguntas_correctas = sc.nextInt();
		
		double porcentaje = preguntas_correctas / preguntas_totales * 100;

		
		if ((preguntas_correctas > preguntas_totales) | (preguntas_correctas < 0) | (preguntas_totales < 1)) {
			System.out.println("No es posible acertar esa cantidad de preguntas.");
		}
		else if (porcentaje >= 90) {
			System.out.println("Nivel máximo");
		}
		else if ((porcentaje >= 75) & (porcentaje < 90)) {
			System.out.println("Nivel medio");
		}
		else if ((porcentaje >= 50) & (porcentaje < 75)) {
			System.out.println("Nivel regular");
		}
		else {
			System.out.println("Fuera de nivel, puto manco");
		}
		System.out.println("fin del programa");
	sc.close();
	}

}
