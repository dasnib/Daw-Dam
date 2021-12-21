
public class Ejemplo_3 {

	public static void main(String[] args) {
		String[] palos = {"oros", "copas", "bastos", "espadas"};
		String[] valores = {"dos", "tres", "cuatro", "cinco", "seis", "site", "sota", "caballo", "rey", "as"};
		for (int i = 0; i < palos.length; i++) {
			System.out.println(palos[i].toUpperCase());
			System.out.println("--------");
			for (int j = 0; j < valores.length; j++) {
				System.out.print(valores[j] + " de " + palos[i] + " | ");
			}
			System.out.println();
			System.out.println();
			System.out.println();
		}
		//carta aleatoria para la banca
		int p2, p1=(int)(Math.random()*palos.length);
		int v2, v1=(int)(Math.random()*valores.length);
		System.out.println("La carta aleatoria de la banca es: " + valores[v1] + " de " + palos[p1]);
		
		//carta aleatoria para el jugador
		do {
			p2=(int)(Math.random()*palos.length);
			v2=(int)(Math.random()*valores.length);
		} while (p1==p2 && v1==v2);
		
		System.out.println("La carta aleatoria del jugador es: " + valores[v2] + " de " + palos[p2]);
		if (v1 >= v2) {
			System.out.println("Gana la banca");
		}
		else {
			System.out.println("Gana el jugador");
		}
	}
}
