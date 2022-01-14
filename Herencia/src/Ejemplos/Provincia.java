package Ejemplos;

public class Provincia {
	private String nombre;
	private String ca;
	private long poblacion;
	private long km2;

	public Provincia(String ub, String c, long p, long km) {
		nombre = ub;
		ca = c;
		poblacion = p;
		km2 = km;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public long getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(long poblacion) {
		this.poblacion = poblacion;
	}

	public long getKm2() {
		return km2;
	}

	public void setKm2(long km2) {
		this.km2 = km2;
	}

	public double densidadPoblacion() {
		double densidad = (double) poblacion /(double) km2;
		return densidad;
	}

	public void muestra() {
		System.out.println("Comunidad Autónoma=" + ca + "    Provincia=" + nombre);
	}

	public String toString() {
		return "Provincia [nombre=" + nombre + ", ca=" + ca + ", poblacion=" + poblacion + ", km2=" + km2 + "]";
	}

}
