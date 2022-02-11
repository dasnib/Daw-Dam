package pq1;

public class Prueba {

	public static void main(String[] args) {

		ListaObjetos lista = new ListaObjetos();
		
		lista.putFinal(new Objeto(0, "hola"));
		lista.putFinal(new Objeto(2, "oboe"));
		lista.putInicio(new Objeto(1, "bobina"));
		lista.putInicio(new Objeto(7, "faro"));
		System.out.println(lista);
		
		System.out.println(lista.count());
			
		System.out.println(lista.getAt(8));
		System.out.println(lista.getAt(2));
		System.out.println(lista.popFinal());
		System.out.println(lista.popPrincipio());
		
		System.out.println(lista);
	}
		

		
}


