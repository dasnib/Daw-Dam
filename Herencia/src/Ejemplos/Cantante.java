package Ejemplos;

public class Cantante {
	private String nombre;
	private String nombreDisco;
	
	public Cantante(String nombre, String nombreDisco) {
		super();
		this.nombre = nombre;
		this.nombreDisco = nombreDisco;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombreDisco() {
		return nombreDisco;
	}

	public void setNombreDisco(String nombreDisco) {
		this.nombreDisco = nombreDisco;
	}

	@Override
	public String toString() {
		return "Cantante [nombre=" + nombre + ", nombreDisco=" + nombreDisco + "]";
	}
	
	
	
	
}
