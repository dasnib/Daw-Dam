
public class Ahorcado {
	private static String palabra_random () {
		String lista_palabras [] = {"pato", "gato", "enciclopedia", "dramaturgo", "creacionismo", "tarta", "borrador", "manzana", "dromedario", "kiwi"};
		int numero_aleatorio = (int)((Math.random()*(9-0+1)+0));
		String palabra = lista_palabras[numero_aleatorio];
		return palabra;
	}
	
	private static void palabra_oculta(String palabra) {
		for (int i = 0; i < palabra.length(); i++) {
			System.out.print("_ ");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("--- JUEGO DEL AHORCADO ---");
		System.out.println();
		System.out.println("# Adivina esta palabra, si fallas 4 letras estarás eliminado");
		
		//int fallos = 0;
		
		String palabra = palabra_random();
		System.out.println(palabra);
		String palabra_oculta = palabra;
		for (int i = 0; i < palabra.length(); i++) {
			palabra_oculta.replaceAll(palabra_oculta, palabra_oculta);
		}
		
		palabra_oculta(palabra);
	}

}
