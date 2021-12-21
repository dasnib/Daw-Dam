
public class Ejercicio_arays_multi_4 {
	
	private static int[][] crearArrayBidim(int filas,int columnas,int minimo,int maximo){
		int[][] miArray=new int[filas][columnas];
		for (int fila = 0; fila < filas; fila++) {
			for (int columna = 0; columna < columnas; columna++) {
				miArray[fila][columna]=(int)(Math.random()*(maximo-minimo+1)+minimo);
			}
		}
		return miArray;
	}

	public static void main(String[] args) {
		int filas = 3, columnas = 4;
		int [][] matriz = crearArrayBidim(filas, columnas, 0, 100);
		
		int mayor = 0;
		int fila_mayor = 0;
 		for (int fila = 0; fila < filas; fila++) {
			int suma = 0;
			for (int columna = 0; columna < columnas; columna++) {
				suma += matriz[fila][columna];
				if (suma >= mayor) {
					mayor = suma;
					fila_mayor = fila;
					
				}
			}
		}
		for (int columna = 0 ; columna < columnas; columna++) {
			System.out.print(matriz[fila_mayor][columna] + ", ");

			}
		}

}
