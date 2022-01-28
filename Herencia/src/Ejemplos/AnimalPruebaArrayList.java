package Ejemplos;

import java.util.ArrayList;

public class AnimalPruebaArrayList {

	public static void main(String[] args) {
		ArrayList<Animal> misAnimales = new ArrayList<Animal>();
		
		AnimalCaracal ca1 = new AnimalCaracal ("Mamifero" , 4, "Sabana");
		Animal an=ca1;
		misAnimales.add(an);
		misAnimales.add(new AnimalGato("Mamifero", 4));
		misAnimales.add(new Animal("Pez", 0));
		
		// 2 Tipos distintos de for para recorrer el ArrayList
		for (int i = 0; i < misAnimales.size(); i++) {
			System.out.println(misAnimales.get(i));
		}
		
		System.out.println();
		for (Animal animal : misAnimales) {
			System.out.println(animal);
		}
		
		// Buscar si hay un objeto concreto en una lista
		int posicion = misAnimales.indexOf(new Animal("Pez", 0));
		if (posicion != -1) {
			System.out.println("\nLa lista contiene el animal buscado");
			System.out.println("Está en la pocicion " + posicion + "\n");
		}else {
			System.out.println("\nLa lista no contiene el animal buscado");
		}
		
		// Incluir un objeto en una posicion desplazando al resto
		misAnimales.add(1, new Animal("Anfibio", 4));
		for (Animal animal : misAnimales) {
			System.out.println(animal);
		}
	}

}
