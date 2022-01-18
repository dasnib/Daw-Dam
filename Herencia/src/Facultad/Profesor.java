package Facultad;

public class Profesor extends Empleado {
	private String departamento;

	public Profesor(String id, String nombre, String apellidos, int anyo, String departamento) {
		super(id, nombre, apellidos, anyo);
		this.departamento = departamento;
	}

	public String getDepartamento() {
		return this.departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "id " + super.getId() + " Año " + super.getAnyo() + " Profesor [departamento=" + departamento + "]";
	}

}
