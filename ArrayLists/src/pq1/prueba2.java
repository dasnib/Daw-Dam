package pq1;

public class prueba2 {

	public static void main(String[] args) {
		ListaObjetos2 l = new ListaObjetos2(5);
		
		Objeto o1 = new Objeto(34, "ana");
		if (l.agregar(o1)) {
			System.out.println("agregado");
		}else {
			System.out.println("no agregado");
		}
		
		
		Objeto o2 = new Objeto(34, "jana");
		if (l.agregar(o2)) {
			System.out.println("agregado");
		}else {
			System.out.println("no agregado");
		}
		
		
		Objeto o3 = new Objeto(30, "Marcos");
		if (l.agregar(o3)) {
			System.out.println("agregado");
		}else {
			System.out.println("no agregado");
		}
		
		System.out.println();
		l.recorrido();
		System.out.println("\n" + l.dameMejor());
	}

}
