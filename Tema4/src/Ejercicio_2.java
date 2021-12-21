
public class Ejercicio_2 {

	public static void main(String[] args) {
		int lista [] = new int[100];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)((Math.random()*100)+1);
		}
		for (int i = 1; i < lista.length; i=i+2) {
			System.out.println("El valor de la casilla " + i + " es: " + lista[i]);
		}
	}

}
