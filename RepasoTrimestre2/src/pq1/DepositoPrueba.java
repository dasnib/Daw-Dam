package pq1;

public class DepositoPrueba {

	public static void main(String[] args) {
		Persona p1 = new Persona("76534261F", "Pepe Perez");
		Persona p2 = new Persona("34636761F", "Ana Perez");
		
		DepositoBancario d1 = new DepositoBancario(p1, 365, 0.5, 1000);
		System.out.println(d1+"\n");
		DepositoBancario d2 = new DepositoBancario(p2, 365, 0.5, 2000);
		System.out.println(d2+"\n");
		
		DepositoBancario d3 = d1;
		
		if (d3.equals(d2)) {
			System.out.println("Los depositos son iguales");
		}else {
			System.out.println("Los depositos no son iguales");
		}
		
		System.out.println(d1.getNombreTitular()+" recibirá dentro de "+d1.getDias()+" días: "+ d1.recibir()+"€");
		System.out.println();
	}

}
