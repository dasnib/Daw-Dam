package Ejercicio2;

public class Nombres {

	private int numMax;
	private String[] lista;
	private int actual;
	
	public Nombres (int max) {
		numMax = max;
		lista = new String [numMax];
		actual = 0;
	}
	
	public void setNumMax (int nuevo){
		numMax = nuevo;
	}
	
	public int getNumMax () {
		return numMax;
	}
	
	public int agregarNombre (String nuevoNombre) {
		if (estaLlena()) {
			//System.out.println("La lista ya está llena");
			return -1;
		}
		else if (actual < numMax){
			for (int i = 0; i < actual; i++) {
				if (lista[i].equals(nuevoNombre)) {
					//System.out.println("El nombre " + nuevoNombre + " ya estaba en la lista");
					return 0;
				}
			}
		}
		lista[actual] = nuevoNombre;
		actual++;
		return 1;
	}
	
	
	public boolean eliminar(String nombre) {
		int posicion = -1;
		for (int i = 0; i < actual; i++) {
			if (lista[i].equals(nombre)) {
				posicion = i;
				break;
			}
		}
		
		if (posicion == -1) {
			return false;
		}

		for (int i = posicion; i < actual-1; i++) {
			lista[i] = lista[i+1];
		}
		lista[actual-1] = null;
		actual--;
		return true;
	}
	
	
	public boolean estaLlena() {
		if (actual == numMax) {
			return true;
		}
		return false;
	}
	
	
	public int maxNombres() {
		return numMax;
	}
	
	
	public int numNombres() {
		return actual;
	}
	
	
	public String stringMostrarInt (int valor) {
		if ((valor<actual) && (valor > -1)) {
			return lista[valor];
		}
		return "Ese valor no existe en la lista";
	}
	
	
	public void vaciar() {
		for (int i = 0; i < actual; i++) {
			lista[i] = null;
		}
		actual = 0;
	}
	
	
	public void verListaActual () {
		System.out.println();
		System.out.println("Listado de nombres");
		for (int i = 0; i < actual; i++) {
			System.out.println(lista[i]);
		}
	}
}