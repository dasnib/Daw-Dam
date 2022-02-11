package pq2;

public class Humano implements Comparable<Humano> {
	private String nombre;
	private int edad;

	public Humano(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//Compara la edad
	/*@Override
	public int compareTo(Humano o) {
		if (this.edad > o.edad) {
			return 1;
		}
		else if (this.edad < o.edad) {
			return -1;
		}
		return 0;
	}*/
	
	//Compara la longitud del nombre
	@Override
	public int compareTo(Humano o) {
		if (this.nombre.length() > o.nombre.length()) {
			return 1;
		}
		else if (this.nombre.length() < o.nombre.length()) {
			return -1;
		}
		return 0;
	}
	
	@Override
	public String toString() {
		return "Humano [nombre=" + nombre + ", edad=" + edad + "]";
	}

}
