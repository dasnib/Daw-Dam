
public class Ejercicio_3 {

	public static void main(String[] args) {
		double [] notas = new double [20];
		for (int i = 0; i < notas.length; i++) {

			notas[i] = Math.random()*10;
		}
		//media
		double total_notas = 0;
		for (int i = 0; i < notas.length; i++) {
			total_notas += notas[i];
		}
		double media = total_notas/20;
		System.out.println("Media de la clase :" + media);
		
		//igual o mayor a la media
		int notas_superiores_media = 0;
		for (int i = 0; i < notas.length; i++) {
			if (notas[i] >= media) {
				notas_superiores_media += 1;
			}
		}
		System.out.println(notas_superiores_media + " alumnos han sacado una nota superior a la media");
	}

}
