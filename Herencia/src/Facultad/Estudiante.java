package Facultad;

public class Estudiante extends Persona{
	private String curso;
	
	public Estudiante (String id, String nombre, String apellidos, String curso	) {
		super(id, nombre, apellidos);
		this.curso = curso;
	}
	
	public String getCurso () {
		return this.curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}

	@Override
	public String toString() {
		return "id " + super.getId() + " Estudiante [curso=" + curso + "]";
	}
	
	
}
