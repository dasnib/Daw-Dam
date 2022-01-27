package Deporte;

public class Futbol extends Deporte {
	private int[] goles;

	public Futbol() {
		super("futbol", 2, 11);
		goles = new int[2];
	}

	public void marcarGol(int equipo) {
		if (equipo == 0 || equipo == 1) {
			goles[equipo] += 1;
		} 
		else {
			System.out.println("No es posible");
		}
	}

	@Override
	public String toString() {
		String salida = "Goles del equipo local= " + goles[0] + "\n" + "Goles del equipo visit= " + goles[1];

		return salida;
	}

}
