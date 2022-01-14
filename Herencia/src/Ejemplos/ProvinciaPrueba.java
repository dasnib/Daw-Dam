package Ejemplos;

public class ProvinciaPrueba {

	public static void main(String[] args) {
		Provincia p1 = new Provincia ("Madrid", "Comunidad de Madrid", 9875942, 8756);
		System.out.println(p1);
		System.out.println("La densidad es: " + p1.densidadPoblacion());
		p1.muestra();
		System.out.println("\n");
		
		ProvinciaCostera pc1 = new ProvinciaCostera ("Málaga", "Andalucía", 98574, 89734,98456);
		System.out.println(pc1);
		System.out.println("La Densidad es: " + pc1.densidadPoblacion());
		pc1.muestra();
		System.out.println("\n");
		
		Provincia[] ps = new Provincia[2];
		ps[0] = p1;
		ps[1] = pc1;
		for (Provincia p:ps) {
			p.muestra();
		}
	}

}
