

public class Ejercicio_8 {

	public static void main(String[] args) {
		int numeros [] = new int [44];
		int a,b,t;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 100);
		}
		// Algoritmo de la burbuja.
        for (a = 0; a < numeros.length-1; a++) {
            for (b = a+ 1; b <numeros.length; b++) {
                if (numeros[a] > numeros[b]) {
                    t = numeros[b];
                    numeros[b] = numeros[a];
                    numeros[a] = t;
                }
            }
        }
        System.out.println("Sorted array is:");
        for (int i = 0; i < numeros.length; i++) {
        	if ((i%10 == 0) & (i !=0)) {
        		System.out.println(" " + numeros[i]);
			}
        	else {
        		System.out.print(" " + numeros[i]);
			}

        }


	}

}
