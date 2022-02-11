package pq2;

public class PruebaMuestra {

	public static void main(String[] args) {
		Muestra m = new Muestra(5);
		m.agregar(new Humano("pepe",20));
		m.agregar(new Humano("daniel",19));
		m.agregar(new Humano("romualdo",18));
		m.agregar(new Humano("dorotea",23));
		m.agregar(new Humano("marisol",22));
		
		System.out.println(" --- Desordenado ---");
		m.ver();
		System.out.println("\n --- Ordenado ---");
		m.ordenarMy();
		m.ver();
	}

}
