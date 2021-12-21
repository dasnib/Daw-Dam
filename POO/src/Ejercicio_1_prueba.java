
public class Ejercicio_1_prueba {

	public static void main(String[] args) {
		Ejercicio_1_VEHICULO coche = new Ejercicio_1_VEHICULO(4, 200, 1500);
		Ejercicio_1_VEHICULO coche2 = new Ejercicio_1_VEHICULO(4, 200, 1400);
		
		Ejercicio_1_VEHICULO fantasma = new Ejercicio_1_VEHICULO(5, 50, 6000);
		
		boolean iguales = coche.esIgual(coche2);
		System.out.println("Coches iguales?: " + iguales);
		
		coche.copia2(fantasma);
		System.out.println();
		
		System.out.println("Coche 1:");
		System.out.println(coche.informacion());
		System.out.println();
		
		System.out.println("Coche 2:");
		System.out.println(coche2.informacion());
		System.out.println();
		
		System.out.println("Coche 3:");
		System.out.println(fantasma.informacion());
		
	}

}
