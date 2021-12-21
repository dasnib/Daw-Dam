
public class Ejercicio_5 {

	public static void main(String[] args) {
		//crea lista aleatoria de 10 numeros entre el 1 y 10
		int [] lista = new int [10];
		for (int i = 0; i < lista.length; i++) {
			lista[i] = (int)(Math.random()*10+1);
		}
		//imprime la lista en una linea
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " | ");
		}
		System.out.println();
		//intercambia el valor de la primera casilla por el de la última
		lista[0] = lista[lista.length-1];
		//imprime la lista modificada en una linea
		for (int i = 0; i < lista.length; i++) {
			System.out.print(lista[i] + " | ");
		}
	}

}
