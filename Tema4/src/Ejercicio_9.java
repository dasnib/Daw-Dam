
public class Ejercicio_9 {

	public static void main(String[] args) {
		int numeros [] = new int [10];
		int a,b,t;
		for (int i = 0; i < numeros.length; i++) {
			numeros[i] = (int)(Math.random() * 100+1);
		}
		System.out.println("ARRAY DESORDENADA");
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " | ");
		}
		
		// Algoritmo de la burbuja MENOR A MAYOR.
        for (a = 0; a < numeros.length-1; a++) {
            for (b = a+ 1; b <numeros.length; b++) {
                if (numeros[a] > numeros[b]) {
                    t = numeros[b];
                    numeros[b] = numeros[a];
                    numeros[a] = t;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("ARRAY ORDENADA DE MENOR A MAYOR");
        for (int i = 0; i < numeros.length; i++) {
        	if ((i%10 == 0) & (i !=0)) {
        		System.out.println(numeros[i] + " | ");
			}
        	else {
        		System.out.print(numeros[i] + " | ");
			}

        }
        
		// Algoritmo de la burbuja MAYOR A MENOR.
        for (a = 0; a < numeros.length-1; a++) {
            for (b = a+ 1; b <numeros.length; b++) {
                if (numeros[a] < numeros[b]) {
                    t = numeros[b];
                    numeros[b] = numeros[a];
                    numeros[a] = t;
                }
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("ARRAY ORDENADA DE MAYOR A MENOR");
        for (int i = 0; i < numeros.length; i++) {
        	if ((i%10 == 0) & (i !=0)) {
        		System.out.println(numeros[i] + " | ");
			}
        	else {
        		System.out.print(numeros[i] + " | ");
			}

        }

	}

}
