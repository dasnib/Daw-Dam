
public class principal {

	public static void main(String[] args) {
		Asignatura asignatura1= new Asignatura();
		asignatura1.curso = 1;
		asignatura1.Especialidad = "Daw";
		asignatura1.nombre = "Programación";
		System.out.println(asignatura1.getNombre());
		asignatura1.horas = 8;

	}

}
