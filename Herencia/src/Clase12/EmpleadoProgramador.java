package Clase12;

public class EmpleadoProgramador extends Empleado {
	private String[] lenguajes;

	public EmpleadoProgramador(String nombre, int telefono, String... lenguajes) {
		super(nombre, telefono);
		this.lenguajes = lenguajes;
	}
	
	public EmpleadoProgramador (String nombre, String...lenguajes) {
		super(nombre);
		this.lenguajes = lenguajes;
	}
	
	public String[] getLenguajes(){
		return lenguajes;
	}

	@Override
	public String toString() {
		String salida= "nombre=" + super.getNombre() + "  telefono=" + super.getTelefono() + "  lenuajes=";
		for (String i : lenguajes) {
			salida += i + "  ";
		}
		return salida;
	}
	
	public static String[] mejoresCandidatos (String lenguaje, EmpleadoProgramador[] empleados) {
		String[] lengs;
		String [] salida = new String[empleados.length];
		int cont = 0;
		for (int i = 0; i < empleados.length; i++) {
			lengs = empleados[i].lenguajes;
			for (int j = 0; j < lengs.length; j++) {
				if (lengs[j].equals(lenguaje)) {
					salida[cont] = empleados[i].getNombre() + " , " + empleados[i].getTelefono();
					cont++;
					break;
				}
			}
		}
		return salida;
	}
}

