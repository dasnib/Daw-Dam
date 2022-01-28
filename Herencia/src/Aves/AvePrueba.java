package Aves;

public class AvePrueba {

	public static void main(String[] args) {
		AveVoladora [] listaAvesVoladoras = new AveVoladora [100];
		listaAvesVoladoras[0] = new AveVoladora("Halcón Mexicano", "Falco mexicanus", 85, "rapaz");
		listaAvesVoladoras[1] = new AveVoladora("Águila Pescadora", "Pandion haliaetus", 105, "rapaz");
		listaAvesVoladoras[2] = new AveVoladora("Tucán", "Ramphastos toco", 60, "trepadora");
		listaAvesVoladoras[3] = new AveVoladora("Pavo Real", "Pavo cristatus", 92, "gallinácea");
		listaAvesVoladoras[4] = new AveVoladora("Garza", "Mesophoyx intermedia", 98, "zancuda");
		listaAvesVoladoras[5] = new AveVoladora("Flamenco", "Phoenicopterus", 56, "zancuda");
		
		for (AveVoladora av : listaAvesVoladoras) {
			if (av == null) {
				break;
			}
			
			if (av.peligroExtincion()) {
				av.incrementarNumeroIndividuos(10);
				if (av.peligroExtincion() == false) {
					System.out.println(av);
				}
			}
			else {
				System.out.println(av);
			}
		}
		
		Ave a1 = new Ave ("Halcón Mexicano", "Cuate aqui hay tomate", 85);
		Ave a2 = new Ave ("Halcón Mexicano", "Cuate aqui hay tomate", 95);
		if (a1.equals(a2)) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("No son iguales");
		}

	}
	

}
