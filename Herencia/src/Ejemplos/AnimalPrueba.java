package Ejemplos;

public class AnimalPrueba {

	public static void main(String[] args) {
		Animal a = new Animal("Mam�fero", 4);
		System.out.println(a);
		a.comoSueno();
		System.out.println();
		
		AnimalGato g1 = new AnimalGato ("Mam�fero", 4);
		System.out.println(g1);
		g1.comoSueno();
		System.out.println();
		
		AnimalCaracal c1 = new AnimalCaracal("Mam�fero", 4, "Sabana/Desierto");
		System.out.println(c1);
		c1.comoSueno();
		
		Animal refAnimal;
		refAnimal = c1;
		System.out.println("Tengo " + refAnimal.getPatas() + " patas");
	}

}
