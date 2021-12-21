package ejerciciosAdicionales;

import java.util.Arrays;

public class CiudadPrueba2 {

	public static void main(String[] args) {
		Ciudad[] listaCiudades1 = new Ciudad[3];
		listaCiudades1[0] = new Ciudad("Sevilla", 50.0, 2.0);
		listaCiudades1[1] = new Ciudad("Valencia", 47.0, 6.0);
		listaCiudades1[2] = new Ciudad("Granada", 43.0, 1.0);

		// Ciudad[] listaCiudades2 = {new Ciudad ("Sevilla", 50.0, 2.0), new Ciudad
		// ("Valencia", 47.0, 6.0)};

		for (Ciudad c : listaCiudades1) {
			System.out.println("Nombre de la ciudad: " + c.getNombre());
			System.out.println("Temperaturas máximas: ");
			System.out.println(Arrays.toString(c.getMaximas()));
			System.out.println("Temperaturas mínimas: ");
			System.out.println(Arrays.toString(c.getMinimas()));
			System.out.println();
		}
		double minimoMinimo = listaCiudades1[0].minimaGeneral();
		int pos = 0;
		for (int i = 1; i < listaCiudades1.length; i++) {
			if (listaCiudades1[i].minimaGeneral() < minimoMinimo) {
				minimoMinimo = listaCiudades1[i].minimaGeneral();
				pos = i;
			}
		}
		System.out.println("La ciudad que ha registrado el mínimo global es " + listaCiudades1[pos].getNombre());
	}
}
