package Ejercicio_otraHoja_2;

public class Profesor {
	private String nombre;
	private String apellidos;
	private int edad;
	private boolean especialista;
	
	public Profesor (String nombre, String apellidos, int edad, boolean especialista) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.especialista = especialista;
	}
	public Profesor () {
		this.nombre = "Pepe";
		this.apellidos = "Viyuela Viyuela";
		this.edad = 20;
		this.especialista = true;
	}
	
	public Profesor(String nombre, String apellidos, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.edad = edad;
		this.especialista = false;
	}
	
	
	public void setNombre (String nombre) {
		this.nombre = nombre;
	}
	public void setApellidos (String apellidos) {
		this.apellidos = apellidos;
	}
	public void setEdad (int edad) {
		this.edad = edad;
	}
	public void setEspecialista (boolean especialista) {
		this.especialista = especialista;
	}
	
	
	public String getNombre () {
		return this.nombre;
	}
	public String getApellidos() {
		return this.apellidos;
	}
	public int getEdad() {
		return this.edad;
	}
	public boolean getEspecialista() {
		return this.especialista;
	}
	
	public String informa() {
		String aux = "no";
		if (especialista) {
			aux = "si";
		}
		return "Nombre: " + nombre + "    Apellidos: " + apellidos + "    Edad: " + edad + "    Especialista: " + aux;
	}
}
