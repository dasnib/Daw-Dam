package Ejemplos;

public class AnimalTestZoo {

	public static void main(String[] args) {
		AnimalZoo zoo = new AnimalZoo();

		zoo.agregarAnimal(new AnimalCaracal ("Mamifero" , 4, "Sabana"));
		zoo.agregarAnimal(new AnimalGato("Mamifero", 4));
		zoo.agregarAnimal(new Animal("Pez", 0));
		zoo.agregarAnimal(new Animal("Anfibio", 4));

		System.out.println(zoo);
		zoo.agregarAnimal(new Animal("Pez", 0));
		System.out.println("\nAnimales de la categoria introducida: " + zoo.IndividuosCategoria("Pez"));
	}

}
