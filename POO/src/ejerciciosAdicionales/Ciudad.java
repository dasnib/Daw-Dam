package ejerciciosAdicionales;

public class Ciudad {
	private String nombre;
	private double[] temperaturaMinima = new double[12];
	private double[] temperaturaMaxima = new double[12];

	public Ciudad(String nombre) {
		this.nombre = nombre;
	}

	public Ciudad(String nombre, double max1, double min1) {
		this.nombre = nombre;
		for (int i = 0; i < temperaturaMaxima.length; i++) {
			temperaturaMaxima[i] = Math.random() * (max1);
			temperaturaMinima[i] = Math.random() * (min1);
		}
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void registrarTemperatura(int mes, double temperatura) {
		if (mes >= 0 && mes <= 11) {
			if (temperaturaMaxima[mes] < temperatura) {
				temperaturaMaxima[mes] = temperatura;
			}
			if (temperaturaMinima[mes] > temperatura) {
				temperaturaMinima[mes] = temperatura;
			}
		}

	}

	public double minimaGeneral() {
		double temp = temperaturaMinima[0];
		for (int i = 1; i < temperaturaMinima.length; i++) {
			if (temperaturaMinima[i] < temp) {
				temp = temperaturaMinima[i];
			}
		}
		return temp;
	}

	public double maximaGeneral() {
		double temp = temperaturaMaxima[0];
		for (int i = 1; i < temperaturaMaxima.length; i++) {
			if (temperaturaMaxima[i] > temp) {
				temp = temperaturaMaxima[i];
			}
		}
		return temp;
	}

	public double[] getMinimas() {
		return this.temperaturaMinima;
	}

	public double[] getMaximas() {
		return this.temperaturaMaxima;
	}

}
