package Ejemplos;

import java.util.ArrayList;

public class AnimalZoo {
	private ArrayList<Animal> catalogo;
	
	public AnimalZoo () {
		this.catalogo = new ArrayList<Animal>();
	}
	
	public AnimalZoo (ArrayList<Animal> catalogo) {
		this.catalogo = catalogo;
	}
	
	public ArrayList<Animal> getCatalogo() {
		return catalogo;
	}

	// Agrega un nuevo animal al zoo
	public boolean agregarAnimal(Animal a) {
		return catalogo.add(a);
	}
	
	// Elimina un animal del zoo
	public boolean DefuncionAnimal(Animal a) {
		return catalogo.remove(a);
	}
	
	// Retorna una lista de las diferentes categorias con el numero de animales existentes en cada una
	public ArrayList<String> listadoIndividuosCategoria() {
		ArrayList <String> salida = new ArrayList<String>();
		
		return salida;
	}
	
	// Retorna la cantidad de animales de una categoria introducida
	public int IndividuosCategoria(String categoria) {
		int contador = 0;
		
		for (Animal animal : catalogo) {
			if (animal.getCategoria().equals(categoria)) {
				contador += 1;
			}
		}
		return contador;
	}

	@Override
	public String toString() {
		return "AnimalZoo [catalogo=" + catalogo + "]";
	}

}
