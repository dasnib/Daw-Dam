
public class pruebaCartelera {

	public static void main(String[] args) {
		Cartelera c = new Cartelera(2);
		Pelicula p1 = new Pelicula("El buen patron", "drama", 90);
		p1.agregar("Barden");
		p1.agregar("Viyuela");
		
		Pelicula p2 = new Pelicula ("Che viene terremoto", "accion", 90);
		p1.agregar("A PEDRA");
		
		c.agregarPelicula(p1, "Madrid");
		c.agregarPelicula(p2, "Madrid");
		c.agregarPelicula(p2, "Sevilla");
		c.agregarPelicula(p2, "Barcelona");
		
		System.out.println(c);
	}

}
