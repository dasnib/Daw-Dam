package Clase12;

public class Empleado {
	private String nombre;
	private int telefono;

	public Empleado(String nombre, int telefono) {
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTelefono() {
		return this.telefono;
	}

	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}

	public String toString() {
		return "Empleado [nombre=" + nombre + ", telefono=" + telefono + "]";
	}

}
