package Instrumento;

public class InstrumentoPrueba {

	public static void main(String[] args) {
		Instrumento g1 = new Guitarra();
		Saxofon s1 = new Saxofon();
		Violin v1 = new Violin();

		g1.tocar();
		s1.tocar();
		v1.tocar();
	}

}
