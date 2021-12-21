
public class Ejercicio_arrays_multi_3 {

	private static void verArrayBidim(int[][] matriz) {
		for (int fila = 0; fila < matriz.length; fila++) {
			for (int columna = 0; columna < matriz[fila].length; columna++) {
				System.out.print(matriz[fila][columna]+"\t");
			}
			System.out.println();
		}
	}
	
	private static int[][] matriz_transpuesta (int[][] matriz, int filas, int columnas) {
		int [][] matriz_aux = new int [filas][columnas];
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				if (fila>columna) {
					matriz_aux[fila][columna] = matriz[fila][columna];
					matriz[fila][columna] = matriz[columna][fila];
					matriz[columna][fila] = matriz_aux[fila][columna];
				}
			}
		}
		return matriz;
	}
	
	public static void main(String[] args) {
		
		int filas = 5, columnas = 5, num = 1;
		int[][] array1 = new int [filas][columnas];
		
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				array1[fila][columna] = num;
				num += 1;
			}
		}
		System.out.println("--- Matriz ---");
		verArrayBidim(array1);
		System.out.println();
		System.out.println("--- Matriz transpuesta ---");
		verArrayBidim(matriz_transpuesta(array1, filas, columnas));
		
	}

}
