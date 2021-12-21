package Ejercicio2;

public class NombresPrueba {

	public static void main(String[] args) {
		Nombres l1 = new Nombres(3);
		
		l1.agregarNombre("Pepe");
		l1.agregarNombre("Juan");
		l1.agregarNombre("Eva");
		
		l1.verListaActual();
		
		
		l1.eliminar("Pepe");
		l1.verListaActual();
		l1.agregarNombre("Pepe");
		
		l1.eliminar("Eva");
		l1.verListaActual();
		
		
		l1.agregarNombre("Marcos");
		l1.verListaActual();
		l1.eliminar("Marcos");
		l1.verListaActual();
		
		l1.eliminar("Mercedes");
		l1.verListaActual();
	}

}
