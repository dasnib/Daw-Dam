
public class Cartelera {
	private static final String[] ciudades = {"Madrid", "Barcelona", "Sevilla"};
	private Pelicula[][] cartelera;
	//private int longitud;
	
	public Cartelera(Pelicula[][] cartelera, int longitud) {
		this.cartelera = cartelera;
		//this.longitud = longitud;
	}
	
	public Cartelera(int longitud) {
		this.cartelera = new Pelicula[ciudades.length][longitud];
		//this.longitud = longitud;
	}
	
	public void agregarPelicula (Pelicula p, String ciudad) {
		int pos = -1;
		for (int i = 0; i < ciudades.length; i++) {
			if (ciudades[i].equals(ciudad)) {
				pos = i;
				break;
			}
		}
		if (pos != -1) {
			for (int i = 0; i < cartelera[pos].length; i++) {
				if (cartelera[pos][i] != null) {
					cartelera[pos][i] = p;
					break;
				}
			}
		}
	}
	

	public String toString() {
		String s = "";
		for (int i = 0; i < cartelera.length; i++) {
			s += "\n cartelera de " + ciudades[i] + "\n";
			for (int j = 0; j < cartelera.length; j++) {
				if (cartelera[i][j] != null) {
					s += cartelera[i][j].toString();
				}
			}
		}
		return s;
	}
	
	
}
