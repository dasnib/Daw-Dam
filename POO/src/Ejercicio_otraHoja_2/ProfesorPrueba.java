package Ejercicio_otraHoja_2;

public class ProfesorPrueba {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor();
		Profesor profesor2 = new Profesor("Manolo", "Garcia Villaespesa", 45, true);

		System.out.println("Profesor 1");
		System.out.println(profesor1.informa());
		System.out.println();
		
		System.out.println("Profesor 2");
		System.out.println(profesor2.informa());
		
		
		System.out.println();
		System.out.println();
		
		profesor1.setNombre("Romualda");
		profesor1.setApellidos("Jimenez Villa");
		profesor1.setEdad(24);
		profesor1.setEspecialista(false);
		
		
		System.out.println("Profesor 1");
		System.out.println(profesor1.informa());
		System.out.println();
		
		System.out.println("Profesor 2");
		System.out.println(profesor2.informa());
	}

}
