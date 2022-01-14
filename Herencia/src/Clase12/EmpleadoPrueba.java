package Clase12;

public class EmpleadoPrueba {

	public static void main(String[] args) {
		Empleado [] empleados= new Empleado [5];
		empleados[0] = new Empleado("Pepe");
		empleados[1] = new Empleado("Eva", 875128745);
		EmpleadoProgramador p2 = new EmpleadoProgramador("Marina", 601436572, "C++", "Java", "Python");
		empleados[2] = p2;
		empleados[3] = new EmpleadoProgramador("David", 765879823);
		empleados[4] = new EmpleadoProgramador("Silvia", 823127845, "Php", "C#", "Python", "Java");
		
		for (Empleado e:empleados) {
			System.out.println(e.toString());
		}
		
		EmpleadoProgramador[] misProg = new EmpleadoProgramador[3];
		misProg[0] = p2;
		misProg[1] = (EmpleadoProgramador)empleados[4];
		misProg[2] = new EmpleadoProgramador("Antonio",11, "Java");
		System.out.println();
		System.out.println("Lista de candidatos");
		for (String dato : EmpleadoProgramador.mejoresCandidatos("Java", misProg)) {
			if (dato!=null) ;
			System.out.println(dato);
		}
	}

}
