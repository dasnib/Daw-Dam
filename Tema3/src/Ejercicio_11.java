
public class Ejercicio_11 {

	public static void main(String[] args) {
		System.out.println("");
		System.out.println("Los 100 primeros números primos son:\n");
		int primo = 1;
		for (int num = 2 ; primo <=100 ; num++) {
			boolean es_primo = true;
			for (int i= num/2 ; i>1 ; i--) {
				if (num%i == 0) {
					es_primo = false;
				    break;
				}
			}
			if (es_primo == true) {
				if ((primo %10 ==0)) {
					System.out.print(" " + num + " \n");
				}
				else {
					System.out.print(" " + num + "\t");
				}
				primo +=1;
			}
		}

	}

}
