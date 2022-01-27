package Deporte;

public class Prueba {

	public static void main(String[] args) {
		Futbol f1 = new Futbol ();
		System.out.println(f1 + "\n");
		
		for (int i = 0; i < 5; i++) {
			f1.marcarGol((int)(Math.random()*2));
		}
		
		System.out.println(f1);

	}

}
