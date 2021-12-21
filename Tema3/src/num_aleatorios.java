
public class num_aleatorios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int maximo = -1, minimo = -500;
		int num , menor = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println(num = (int)(Math.random() * (maximo-minimo + 1) + (minimo)));
			if (num < menor) {
				menor = num;
			}
		}
		System.out.println("El número menor es: " + menor);
			
	}
}