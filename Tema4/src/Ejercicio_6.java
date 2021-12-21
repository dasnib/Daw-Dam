
public class Ejercicio_6 {

	public static long Factorial(int num) {
		long f=1;
		for (int i = 1; i < num; i++) {
			f=f*i;
		}
		return f;
	}
	
	public static void mostrar_array(long[] mi_array) {
		for (int i = 0; i < mi_array.length; i++) {
			System.out.println("El factorial de " + (i+1) + " es " + mi_array[i]);
		}
	}
	
	public static void main(String[] args) {
		long [] factoriales = new long[20];
		for (int i = 0; i < factoriales.length; i++) {
			factoriales[i] = Factorial(i+1);
		}
	mostrar_array(factoriales);
	}

}
