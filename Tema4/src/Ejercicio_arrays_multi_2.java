
public class Ejercicio_arrays_multi_2 {
	
	private static void verArrayBidim(int[][] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < vector[i].length; j++) {
				System.out.print(vector[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int filas = 5, columnas = 7, num = filas * columnas;
		int[][] array1 = new int [filas][columnas];
		
		//Forma 1
		for (int fila = 0; fila < filas; fila++) {
			int numaux = num;
			for (int columna = 0; columna < columnas; columna++) {
				array1[fila][columna] = numaux;
				numaux -= 5;
			}
			num-=1;
		}
		verArrayBidim(array1);
		
		System.out.println();
		
		//Forma 2
		num = filas*columnas;
		for(int columna = 0; columna < columnas; columna++) {
			for (int fila = 0; fila < filas; fila++) {
				array1[fila][columna] = num;
				num  -= 1;
			}
		}
		verArrayBidim(array1);
	}

}
