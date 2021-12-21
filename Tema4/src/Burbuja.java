// lista mayor nota a menor

public class Burbuja {
	public static void mostrar(String[] mi_array) {
		for (int i = 0; i < mi_array.length; i++) {
			System.out.print(mi_array[i] + " | ");
		}
	}
	
	public static void main(String args[]) {
        int notas[] = {7,8,4,3,6};
        String nombres[] = {"pepe", "ana", "juan", "eva", "antonio"};
        int aux_notas;
        String aux_nombres;
        int tam = nombres.length;

        for (int i = 0; i < tam-1; i++) {
            for (int j = i + 1; j < tam; j++) {
				if (notas[i]<notas[j]) {
					aux_notas = notas[i];
					aux_nombres = nombres[i];
					
					notas[i] = notas[j];
					nombres[i] = nombres[j];
					
					notas[j] = aux_notas;
					nombres[j] = aux_nombres;
				}
            	
			}
        }
        

        for (int i = 0; i < tam; i++) {
			nombres[i] = nombres[i] + " " + notas[i];
		}
        System.out.println("Datos ordenados");
        mostrar(nombres);

    }
}
